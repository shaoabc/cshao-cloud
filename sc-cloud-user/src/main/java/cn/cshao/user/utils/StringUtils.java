package cn.cshao.user.utils;

import org.apache.commons.lang3.ArrayUtils;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @desc: 字符串工具类
 * @CreateDate 2019-12-18 15:30
 * @author SmallDays
 */
public class StringUtils {

    //锁对象，可以为任意对象
    private static Object lockObj = "lockerOrder";

    //订单号生成计数器
    private static long orderNumCount = 0L;

    //每毫秒生成订单号数量最大值
    private static int maxPerMSECSize = 1000;

    //数值
    public static final String NUM = "0123456789";

    //小写字母
    public static final String A_Z_MIN = "abcdefghijklmnopqrstuvwxyz";

    //大写字母
    public static final String A_Z_MAX = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /*
     * @desc 判断字符串是否为空
     * @param cs 字符串
     * @return 为空返回true, 不为空返回false
     */
    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /*
     * @desc 判断字符串是否不为空
     * @param cs 字符串
     * @return 为空返回false, 不为空返回true
     */
    public static boolean isNotBlank(final CharSequence cs) {
        return !isBlank(cs);
    }

    /*
     * @desc 判断多个字符串是否为空
     * @param css 多个字符串
     * @return 为空返回true, 不为空返回false
     */
    public static boolean isAnyBlank(final CharSequence... css) {
        if (ArrayUtils.isEmpty(css)) {
            return true;
        }
        for (final CharSequence cs : css) {
            if (isBlank(cs)) {
                return true;
            }
        }
        return false;
    }

    /*
     * @desc 判断多个字符串是否不为空
     * @param css 多个字符串
     * @return 为空返回true, 不为空返回false
     */
    public static boolean isAnyNotBlank(final CharSequence... css) {
        return !isAnyBlank(css);
    }

    /*
     * @desc 分隔符字符串 转换list
     * @param splitStr
     * @param split
     * @return
     */
    public static List<String> getSplitToList(String splitStr, String split) {
        if (isAnyBlank(splitStr, split)) {
            return null;
        }
        String[] strS = splitStr.split(split);
        if (strS.length == 0) {
            return null;
        }
        return Arrays.asList(strS);
    }

    /**
     * 字符串转换
     *
     * @param obj
     * @return
     */
    public static String objToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /**
     * String 转换 Integer类型
     *
     * @param num
     * @return
     */
    public static Integer strToInteger(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * String 转换 Long 类型
     *
     * @param num
     * @return
     */
    public static Long strToLong(String num) {
        if (isBlank(num)) {
            return 0L;
        }
        Long count = 0L;
        try {
            count = Long.parseLong(num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * String 转换 Double类型
     *
     * @param num
     * @return
     */
    public static Double strToDouble(String num) {
        if (isBlank(num)) {
            return 0.0;
        }
        Double count = 0.0;
        try {
            count = Double.parseDouble(num);
        } catch (NumberFormatException e) {
            return count;
        }
        return count;
    }

    /**
     * String 转换 BigDecimal类型
     *
     * @param num
     * @return
     */
    public static BigDecimal strToBigDecimal(String num) {
        if (isBlank(num)) {
            return new BigDecimal(0);
        }
        BigDecimal count = new BigDecimal(0);

        try {
            count = new BigDecimal(num);
        } catch (Exception e) {
            return count;
        }
        return count;
    }

    /**
     * 生成32位ID
     *
     * @return
     */
    public static String getUUID() {
        String s = UUID.randomUUID().toString();
        return s.replaceAll("-", "").toUpperCase();
    }

    /**
     * 数字补0 字符串
     *
     * @param num
     * @param count
     * @return
     */
    public static String numAddZero(String num, Integer count) {
        Integer numLenght = num.length();
        Integer forCount = count - numLenght;
        String str = null;
        for (int i = 1; i <= forCount; i++) {
            str += "0";
        }
        return str + num;
    }

    /*
     * @desc 随机指定位数字符串
     * @param length 需要返回字符串的长度
     * @return 生成好的字符串
     */
    public static String getRandomString(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        String base = NUM + A_Z_MAX + A_Z_MIN;
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String getRandomString(int length, String... filter) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        String base = NUM + A_Z_MAX + A_Z_MIN;
        for (String s : filter) {
            if (base.contains(s)) {
                base = base.replace(s, "");
            }
        }
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String getRandomString(int length, String source) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(source.length());
            sb.append(source.charAt(number));
        }
        return sb.toString();
    }

    public static String getRandomLowercase(int length, String[] filter) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        String base = A_Z_MIN;
        for (String s : filter) {
            if (base.contains(s)) {
                base = base.replace(s, "");
            }
        }
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String getRandomLowercase(Integer length, String... filter) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        String base = A_Z_MIN;
        for (String s : filter) {
            if (base.contains(s)) {
                base = base.replace(s, "");
            }
        }
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 使用StringBuilder 拼凑字符串
     *
     * @param str
     * @return
     */
    public static String builderStr(String... str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }

    /**
     * 字符串 过长截取 如：abcde abcd...
     *
     * @param count
     * @param str
     * @param type
     * @return
     */
    public static String omitStr(int count, String str, String type) {
        if (isBlank(str)) {
            return null;
        }
        return builderStr(str.substring(0, count), type);
    }

    /**
     * 剔除特殊字符
     */
    public static String filterOffUtf8Mb4(String text) {
        if (isBlank(text)) {
            return null;
        }
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        ByteBuffer buffer = ByteBuffer.allocate(bytes.length);
        int i = 0;
        while (i < bytes.length) {
            short b = bytes[i];
            if (b > 0) {
                buffer.put(bytes[i++]);
                continue;
            }
            b += 256; // 去掉符号位
            if (((b >> 5) ^ 0x6) == 0) {
                buffer.put(bytes, i, 2);
                i += 2;
            } else if (((b >> 4) ^ 0xE) == 0) {
                buffer.put(bytes, i, 3);
                i += 3;
            } else if (((b >> 3) ^ 0x1E) == 0) {
                i += 4;
            } else if (((b >> 2) ^ 0x3E) == 0) {
                i += 5;
            } else if (((b >> 1) ^ 0x7E) == 0) {
                i += 6;
            } else {
                buffer.put(bytes[i++]);// 添加处理如b的指为-48等情况出现的死循环
            }
        }
        buffer.flip();
        return new String(buffer.array(), StandardCharsets.UTF_8);
    }


    /**
     * 下划线转驼峰法
     *
     * @param line       源字符串
     * @param smallCamel 大小驼峰,是否为小驼峰
     * @return 转换后的字符串
     */
    public static String underlineToCamel(String line, boolean smallCamel) {
        if (isBlank(line)) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        Pattern pattern = Pattern.compile("([A-Za-z\\d]+)(_)?");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            String word = matcher.group();
            sb.append(smallCamel && matcher.start() == 0 ? Character.toLowerCase(word.charAt(0)) : Character.toUpperCase(word.charAt(0)));
            int index = word.lastIndexOf('_');
            String str = index > 0 ? word.substring(1, index).toLowerCase() : word.substring(1).toLowerCase();
            sb.append(str);
        }
        return sb.toString();
    }

    /**
     * 驼峰法转下划线
     *
     * @param line 源字符串
     * @return 转换后的字符串
     */
    public static String camelToUnderline(String line) {
        if (isBlank(line)) {
            return null;
        }
        line = String.valueOf(line.charAt(0)).toUpperCase().concat(line.substring(1));
        StringBuffer sb = new StringBuffer();
        Pattern pattern = Pattern.compile("[A-Z]([a-z\\d]+)?");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            String word = matcher.group();
            sb.append(word.toLowerCase());
            sb.append(matcher.end() == line.length() ? "" : "_");
        }
        return sb.toString();
    }

    /**
     * 生成非重复订单号，理论上限1毫秒1000个，可扩展
     *
     * @param prefix 订单前缀
     */
    public static String makeOrderNum(String prefix) {
        // 最终生成的订单号
        String finOrderNum = null;
        try {
            synchronized (lockObj) {
                // 取系统当前时间作为订单号变量前半部分，精确到毫秒
                long nowLong = System.currentTimeMillis();
                // 计数器到最大值归零，可扩展更大，目前1毫秒处理峰值1000个，1秒100万
                if (orderNumCount >= maxPerMSECSize) {
                    orderNumCount = 0L;
                }
                // 组装订单号
                String countStr = (maxPerMSECSize + orderNumCount) + "";
                finOrderNum = prefix + nowLong + countStr.substring(1);
                orderNumCount++;
            }
            return finOrderNum;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /*
     * 隐藏手机号中间四位、替换为星号*
     * @param mobile
     * @return
     */
    public static String hideMobile(String mobile) {
        if (StringUtils.isBlank(mobile)) {
            return mobile;
        }
        return mobile.substring(0, 3) + "****" + mobile.substring(mobile.length() - 4);
    }

    /*
     * 隐藏身份证号码、替换为星号*
     * @param idCard
     * @return
     */
    public static String hideIdCard(String idCard) {
        if (StringUtils.isBlank(idCard)) {
            return idCard;
        }
        return idCard.substring(0, 3) + "********" + idCard.substring(idCard.length() - 2);
    }

    /*
     * 隐藏银行卡号中间的几位、替换为星号*
     * @param idCard
     * @return
     */
    public static String hideBankNo(String accountNo) {
        if (StringUtils.isBlank(accountNo)) {
            return accountNo;
        }
        return accountNo.substring(0, 4) + "*********" + accountNo.substring(accountNo.length() - 4);
    }
    /**
     * 姓名脱敏
     * 一位时不脱敏，两位时‘姓’脱敏，两位以上保留首尾中间脱敏
     * @param str
     * @return
     */
    public static String nameDesensitization(String str) {
         if (str == null || str.equals("")){
            return str;
        }
        char[] sArr = str.toCharArray();
        if (sArr.length == 2) {
            return "*" + sArr[1];
        } else if (sArr.length  > 2) {
            for (int i = 1; i < sArr.length -1; i++) {
                sArr[i] = '*';
            }
            return new String(sArr);
        }
        return str;
    }

    /**
     * 判断是否为空
     * @param str
     * @return
     */
    public static Boolean isEmpty(String str) {
        if (str == null || str.equals("")){
            return true;
        }
        return false;
    }


    /**
     * 不传前缀生成订单号
     *
     * @return
     */
    public static String makeOrderNum() {
        return makeOrderNum("");
    }

    public static void main(String[] args) {
        System.out.println(nameDesensitization("你好"));
    }

}