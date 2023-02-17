package cs.cshao.common.alg;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.SecureRandom;

public class DES {
    private static String ALGORITHM = "DES";
    private static String CHARSETNM = "UTF-8";

    private static Key initKey(String secret) {
        KeyGenerator generator = null;
        try {
            //生成DES算法对象
            generator = KeyGenerator.getInstance(ALGORITHM);
            //运用SHA1安全策略
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            //设置上密钥种子
            secureRandom.setSeed(secret.getBytes());
            //初始化基于SHA1的算法对象
            generator.init(secureRandom);
            //生成密钥对象
            return generator.generateKey();
        } catch (Exception e) {
            throw new RuntimeException("DES 获取KEY 异常", e);
        } finally {
            generator = null;
        }
    }

    /***
     * 获取加密的信息
     * @param str
     * @return
     */
    public static String encrypt(String str, String secret) {
        Key key = initKey(secret);
        //基于BASE64编码，接收byte[]并转换成String
        BASE64Encoder encoder = new BASE64Encoder();
        try {
            //按utf8编码
            byte[] bytes = str.getBytes(CHARSETNM);
            //获取加密对象
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            //初始化密码信息
            cipher.init(Cipher.ENCRYPT_MODE, key);
            //加密
            byte[] doFinal = cipher.doFinal(bytes);
            //byte[]to encode好的String 并返回
            return encoder.encode(doFinal);
        } catch (Exception e) {
            throw new RuntimeException("DES 加密 异常", e);
        }
    }

    /***
     * 获取解密之后的信息
     * @param str
     * @return
     */
    public static String decrypt(String str, String secret) {
        Key key = initKey(secret);
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            //将字符串decode成byte[]
            byte[] bytes = decoder.decodeBuffer(str);
            //获取解密对象
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            //初始化解密信息
            cipher.init(Cipher.DECRYPT_MODE, key);
            //解密
            byte[] doFial = cipher.doFinal(bytes);
            return new String(doFial, CHARSETNM);
        } catch (Exception e) {
            throw new RuntimeException("DES 解密 异常", e);
        }
    }

}
