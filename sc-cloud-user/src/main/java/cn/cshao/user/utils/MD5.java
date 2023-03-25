package cn.cshao.user.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * @author shaochen
 * MD5 加密
 */
public class MD5 {
    public static void main(String[] args) {
        String data = "123456";
        System.out.println(md5(data));
    }

    /**
     * @desc MD5加密方法
     * @param data 待加密的数据
     * @return String 加密好的数据
     */
    public static String md5(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update((data).getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No Such Algorithm Exception", e);
        }
    }

	/*
	 * @desc MD5加密方法
	 * @param data 待加密的数据
	 * @param secretKey  密钥
	 * @return String 加密好的数据
	 */
    public static String md5(String data, String secretKey) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update((data + secretKey).getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No Such Algorithm Exception", e);
        }
    }



    /*
     * @desc MD5验证方法
     * @param data 待验证的数据
     * @param md5        密文
     * @return true/false
     */
    public static boolean verifyMd5(String data,  String md5) {
        return md5(data).equalsIgnoreCase(md5);
    }

    /*
     * @desc MD5验证方法
     * @param data 待验证的数据
     * @param secretKey  密钥
     * @param md5        密文
     * @return true/false
     */
    public static boolean verifyMd5(String data, String secretKey, String md5) {
        return md5(data, secretKey).equalsIgnoreCase(md5);
    }

}