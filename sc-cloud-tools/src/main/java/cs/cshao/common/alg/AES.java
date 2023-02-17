package cs.cshao.common.alg;

import cs.cshao.common.utils.sequence.UUIDUtils;
import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;


/**
 * AES 加密解密
 */
public class AES {
    private static final String AES_CONST = "AES";
    //PKCS5
    private static final String AES_CBC_PKCS5 = "AES/CBC/PKCS5Padding";// "算法/模式/补码方式"
    private static final String AES_CBC_PKCS7 = "AES/CBC/PKCS7Padding";// "算法/模式/补码方式"
    //AES算法 分组长度
    private static final int AES_LENGTH = 128;
    private static final int BLOCK_SIZE = 16;

    private static boolean initialized = false;

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    /*
     * 依赖随机数产生 AES key 目前只开放128位 返回BASE64编码
     * @param random 随机数
     * @return String BASE64编码
     */
    public static String generateKey(String random) {
        try {
            KeyGenerator kg = KeyGenerator.getInstance(AES_CONST);
            // kg.init(128);//要生成多少位，只需要修改这里即可128, 192或256
            // SecureRandom是生成安全随机数序列，random.getBytes()是种子，只要种子相同，序列就一样，所以生成的秘钥就一样。
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(random.getBytes());
            kg.init(AES_LENGTH, secureRandom);
            SecretKey sk = kg.generateKey();
            byte[] b = sk.getEncoded();
            return Base64.encodeBase64String(b);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No Such Algorithm Exception", e);
        }
    }

    /*
     * @desc AES 加密
     * @param key  AES key
     * @param encryptData 待加密数据字符串
     * @return String BASE64 编码
     */
    public static String encrypt(String key, String encryptData) {
        byte[] data = encryptData.getBytes();
        return Base64.encodeBase64String(encrypt(key, data));
    }

    /*
     * @desc AES 解密
     * @param key  AES key
     * @param encryptData 待解密数据字符串 BASE64 编码
     * @return String 解密结果
     */
    public static String decrypt(String key, String encryptData) {
        byte[] cryptByte = Base64.decodeBase64(encryptData);
        byte[] origData = decrypt(key, cryptByte);
        return new String(origData);
    }

    /*
     * @desc AES 加密 返回 byte 数组
     * @param key  AES key BASE64编码
     * @param data byte[] 待加密数据
     * @return byte[]
     */
    public static byte[] encrypt(String key, byte[] data) {
        byte[] keyBytes = getSecretKey(generateKey(key));
        byte[] buf = new byte[BLOCK_SIZE];
        System.arraycopy(keyBytes, 0, buf, 0, Math.max(keyBytes.length, buf.length));
        try {
            Cipher cipher = Cipher.getInstance(AES_CBC_PKCS5);
            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(keyBytes, AES_CONST), new IvParameterSpec(buf));
            return cipher.doFinal(data);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("AES 加密 异常", e);
        }
    }


    /*
     * @desc AES 解密 返回 byte 数组
     * @param key  AES key BASE64编码
     * @param data 已加密数据
     * @return byte[]
     */
    public static byte[] decrypt(String key, byte[] data) {
        byte[] keyBytes = getSecretKey(generateKey(key));
        byte[] buf = new byte[BLOCK_SIZE];
        System.arraycopy(keyBytes, 0, buf, 0, Math.max(keyBytes.length, buf.length));
        try {
            Cipher cipher = Cipher.getInstance(AES_CBC_PKCS5);
            // 密钥作为初始化变量
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(keyBytes, AES_CONST), new IvParameterSpec(buf));
            return cipher.doFinal(data);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("AES 解密异常", e);
        }
    }


    /*
     * @desc 返回密钥
     * @param key BASE64编码
     * @return byte[] 数组
     */
    private static byte[] getSecretKey(String key) {
        byte[] keyBytes = Base64.decodeBase64(key);
        // 128为公 BLOCK_SIZE 个字节长度
        if (BLOCK_SIZE != keyBytes.length) {
            throw new RuntimeException("密钥长度不符合,需为128位");
        }
        return keyBytes;
    }

    /**
     * AES解密
     *
     * @param content 密文
     * @return
     * @throws NoSuchProviderException
     */
    public byte[] decrypt(byte[] content, byte[] keyByte, byte[] ivByte) {
        initialize();
        try {
            Cipher cipher = Cipher.getInstance(AES_CBC_PKCS5);
            Key sKeySpec = new SecretKeySpec(keyByte, "AES");
            cipher.init(Cipher.DECRYPT_MODE, sKeySpec, generateIV(ivByte));// 初始化
            byte[] result = cipher.doFinal(content);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void initialize() {
        if (initialized) {
            return;
        }
        Security.addProvider(new BouncyCastleProvider());
        initialized = true;
    }

    // 生成iv
    public static AlgorithmParameters generateIV(byte[] iv) throws Exception {
        AlgorithmParameters params = AlgorithmParameters.getInstance("AES");
        params.init(new IvParameterSpec(iv));
        return params;
    }


    public static void main(String[] args) {
        String uuid = UUIDUtils.getUUID();
        String key = "e4b1a13ea0b24119a3de8143d3593d6d";// uuid;//AES.generateKey(uuid);
        String jmh = AES.encrypt(key, "888899996666555");
//        String jmh2 = AES.encrypt(key, "eW0cJzCYoaEZI6XLCRIUsL8IpoB5XR");
//
//        String jmh22 = AES.decrypt(key, jmh);
//        String jmh222 = AES.decrypt(key, jmh2);
//
        System.out.println(jmh);
//        System.out.println(jmh2);
//        System.out.println(jmh22);
//        System.out.println(jmh222);
//        String decrypt = AES.decrypt("10", "tgl3HPm+lCB0h8m0k1gdjA==");
//        System.out.println(decrypt);
//        System.out.println(AES.encrypt(key, decrypt));

    }
}