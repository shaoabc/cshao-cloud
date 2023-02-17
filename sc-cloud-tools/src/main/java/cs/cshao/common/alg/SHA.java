package cs.cshao.common.alg;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SHA {

    /**
     * @desc  哈希256加密
     * @param  data   待加密的数据
     * @return String 加密好的数据 返回16进制
     */
    public static String sha256(String data) {
        try {
            MessageDigest md = DigestUtils.getDigest("SHA-256");
            md.update(data.getBytes(StandardCharsets.UTF_8));
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * @desc  哈希256加密
     * @param data 待加密的数据
     * @param secretKey  密钥
     * @return String 加密好的数据 Base64编码
     */
    public static String sha256(String data, String secretKey) {
        try {
            MessageDigest md = DigestUtils.getDigest("SHA-256");
            md.update((data + secretKey).getBytes(StandardCharsets.UTF_8));
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @desc  哈希256加密
     * @param  data   待加密的数据
     * @return String 加密好的数据 Base64编码
     */
    public static String sha256Base64(String data) {
        try {
            MessageDigest md = DigestUtils.getDigest("SHA-256");
            md.update(data.getBytes(StandardCharsets.UTF_8));
            return Base64.encodeBase64String(md.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * @desc  哈希256加密
     * @param data 待加密的数据
     * @param secretKey  密钥
     * @return String 加密好的数据 Base64编码
     */
    public static String sha256Base64(String data, String secretKey) {
        try {
            MessageDigest md = DigestUtils.getDigest("SHA-256");
            md.update((data + secretKey).getBytes(StandardCharsets.UTF_8));
            return Base64.encodeBase64String(md.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @desc sha256 验证方法
     * @param data 待验证的数据
     * @param secretKey密钥
     * @param sha256Data 密文
     * @return true/false
     */
    public static boolean verifySHA256(String data, String sha256Data) {
        return sha256(data).equalsIgnoreCase(sha256Data);
    }

    /**
     * @desc sha256 验证方法
     * @param data 待验证的数据
     * @param secretKey  密钥
     * @param sha256Data 密文
     * @return true/false
     */
    public static boolean verifySHA256(String data, String secretKey, String sha256Data) {
        return sha256(data, secretKey).equalsIgnoreCase(sha256Data);
    }

    /**
     * @desc sha256 验证方法
     * @param data 待验证的数据
     * @param secretKey密钥
     * @param sha256Data 密文 Base64编码
     * @return true/false
     */
    public static boolean verifySHA256Base64(String data, String sha256Data) {
        return sha256(data).equalsIgnoreCase(sha256Data);
    }

    /**
     * @desc sha256 验证方法
     * @param data 待验证的数据
     * @param secretKey  密钥
     * @param sha256Data 密文 Base64编码
     * @return true/false
     */
    public static boolean verifySHA256Base64(String data, String secretKey, String sha256Data) {
        return sha256(data, secretKey).equalsIgnoreCase(sha256Data);
    }

}