package cs.cshao.common.utils.string;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串处理工具类
 * <p>
 * File name : StringUtil.java
 * </P>
 * <p>
 * Author : NTR.FUTURE
 * </P>
 * <p>
 * Date : 2015年3月13日
 * </P>
 * @author shaochen
 */
public class StringUtil {

    static Pattern MOBILE_PATTERN = Pattern.compile("^(1[0-9])\\d{9}$");


    /**
     * 价格转换 从数据库读出钱时，调用这个函数（数据库保存的金额为分，前台显示为元）
     * StringUtil.formatMoneyFromData()<BR>
     * <p>
     * Author : NTR.FUTURE
     * </P>
     * <p>
     * Date : 2015年3月13日
     * </P>
     *
     * @param price
     *
     * @return
     */
    @Deprecated
    public static String formatMoneyFromData(String price) {
        return new DecimalFormat("0.00").format(new BigDecimal(price).divide(new BigDecimal(100)));
    }

    /**
     * 将分为单位的钱格式化为 123,456.00 的保留两位小数元为单位字符串
     *
     * @param fen
     *
     * @return
     */
    @Deprecated
    public static String formatFen2YuanStr(Integer fen) {
        BigDecimal yuan = BigDecimal.valueOf(fen).divide(BigDecimal.valueOf(100));
        return new DecimalFormat("0.00").format(yuan);
    }

    /**
     * 判断手机号的正则
     *
     * @param phoneNum
     *
     * @return
     */
    public static boolean isMobileNum(String phoneNum) {
        if (StringUtils.isEmpty(phoneNum)) {
            return false;
        }
        Matcher m = MOBILE_PATTERN.matcher(phoneNum);
        return m.matches();

    }

    /**
     * message模版格式化
     *
     * @param msg
     * @param params
     *
     * @return String 返回类型
     *
     * @throws
     * @Title: templateFormat
     */
    public static String templateFormat(String msg, Object... params) {

        String resultStr = msg;
        if (null != params && params.length > 0) {
            resultStr = MessageFormat.format(msg, params);
        }
        return resultStr;
    }

    /**
     * List转换逗号拼接字符串
     * StringUtil.convertListToStr()
     *
     * @param list
     *
     * @return 若list中元素为空，返回空字符串
     *
     * @Date 2015年12月7日
     * @since 1.5.0
     */
    public static String convertListToStr(List<? extends Number> list) {

        String result = "";
        if (null != list && !list.isEmpty()) {
            StringBuilder resultSb = new StringBuilder();
            for (Number number : list) {
                if (null == number) {
                    continue;
                }
                resultSb.append(number.toString()).append(",");
            }
            if (resultSb.length() > 0) {
                result = resultSb.substring(0, resultSb.length() - 1);
            }
        }
        return result;
    }

    /**
     * 获取字符串unicode编码
     * StringUtil.encodeUnicode()
     *
     * @param sourceStr 源字符串
     *
     * @return
     *
     * @Date 2016年3月6日
     * @since 2.2.0
     */
    public static String encodeUnicode(String sourceStr) {
        if (StringUtils.isEmpty(sourceStr)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            char c = sourceStr.charAt(i);
            sb.append("\\u").append(Integer.toHexString(c));
        } while (++i < sourceStr.length());
        return sb.toString();
    }

    /**
     * 获取Unicode对应字符串
     * StringUtil.decodeUnicode()
     *
     * @param unicodeStr Unicode串
     *
     * @return
     *
     * @Date 2016年3月6日
     * @since 2.2.0
     */
    public static String decodeUnicode(String unicodeStr) {
        char aChar;
        int len = unicodeStr.length();
        StringBuffer outBuffer = new StringBuffer(len);
        for (int x = 0; x < len; ) {
            aChar = unicodeStr.charAt(x++);
            if (aChar == '\\') {
                aChar = unicodeStr.charAt(x++);
                if (aChar == 'u') {
                    // Read the xxxx
                    int value = 0;
                    for (int i = 0; i < 4; i++) {
                        aChar = unicodeStr.charAt(x++);
                        switch (aChar) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                value = (value << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                value = (value << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                value = (value << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException("Malformed   \\uxxxx   encoding.");
                        }

                    }
                    outBuffer.append((char) value);
                } else {
                    if (aChar == 't') {
                        aChar = '\t';
                    } else if (aChar == 'r') {
                        aChar = '\r';
                    } else if (aChar == 'n') {
                        aChar = '\n';
                    } else if (aChar == 'f') {
                        aChar = '\f';
                    }
                    outBuffer.append(aChar);
                }
            } else {
                outBuffer.append(aChar);
            }
        }
        return outBuffer.toString();
    }

    /**
     * Set转换逗号拼接字符串
     * StringUtil.convertListToStr()
     *
     * @param
     *
     * @return 若list中元素为空，返回空字符串
     *
     * @Author Gaoll
     * @Date 2016年7月15日
     * @since 2.5.0
     */
    public static String convertCollection(Collection<? extends Number> collectoin) {

        String result = "";
        if (null != collectoin && !collectoin.isEmpty()) {
            StringBuilder resultSb = new StringBuilder();
            for (Number number : collectoin) {
                if (null == number) {
                    continue;
                }
                resultSb.append(number.toString()).append(",");
            }
            if (resultSb.length() > 0) {
                result = resultSb.substring(0, resultSb.length() - 1);
            }
        }
        return result;
    }

    /**
     * 转换long列表字符串到集合
     * StringUtil.convertLongStr2List()
     *
     * @param str
     * @param splitStr
     *
     * @return
     *
     * @Author guoyongxiang
     * @Date 2017年4月5日
     * @since 2.7.0
     */
    public static List<Long> convertLongStr2List(String str, String splitStr) {
        List<Long> list = new ArrayList<>();
        if (!StringUtils.isBlank(str)) {
            String[] strArr = str.split(splitStr);
            for (String item : strArr) {
                if (!"".equals(item)) {
                    list.add(Long.valueOf(item));
                }
            }
        }
        return list;
    }

    /**
     * 转换long列表字符串到集合
     * StringUtil.convertLongStr2Set()
     *
     * @param str
     * @param splitStr
     *
     * @return
     *
     * @Author cshao
     * @Date 2017年4月5日
     * @since 2.7.0
     */
    public static Set<Long> convertLongStr2Set(String str, String splitStr) {
        Set<Long> set = new HashSet<>();
        if (!StringUtils.isBlank(str)) {
            String[] strArr = str.split(splitStr);
            for (String item : strArr) {
                if (!"".equals(item)) {
                    set.add(Long.valueOf(item));
                }
            }
        }
        return set;
    }

    /**
     * 转换Integer列表字符串到集合
     * StringUtil.convertIntegerStr2List()
     *
     * @param str
     * @param splitStr
     *
     * @return
     *
     * @Author cshao
     * @Date 2017年4月5日
     * @since 2.7.0
     */
    public static List<Integer> convertIntegerStr2List(String str, String splitStr) {
        List<Integer> list = new ArrayList<>();
        if (!StringUtils.isBlank(str)) {
            String[] strArr = str.split(splitStr);
            for (String item : strArr) {
                if (!"".equals(item)) {
                    list.add(Integer.valueOf(item));
                }
            }
        }
        return list;
    }

    /**
     * 格式化uuid
     * StringUtil.formatUUID()
     *
     * @return
     *
     * @Author cshao
     * @Date 2017年6月12日
     * @since 1.0.0
     */
    public static String formatUUID() {
        return UUID.randomUUID().toString().replaceAll("\\-", "");

    }

    /**
     * 加密手机中间4位
     *
     * @param phone
     *
     * @return
     */
    public static String securePhone(String phone) {
        if (StringUtils.isNotBlank(phone)) {
            return phone.replaceAll("^(.{3})(.{4})(.{4})", "$1****$3");
        }
        //若非正常手机格式，原样输出
        return phone;
    }

    /**
     * 加密身份证中间4位
     *
     * @param idcard
     *
     * @return
     */
    public static String secureIdcard(String idcard) {
        if (StringUtils.isBlank(idcard)) {
            return idcard;
        }
        if (idcard.length() == 15) {
            return idcard.replaceAll("^(.{3})(.*)(.{3})", "$1*********$3");
        } else if (idcard.length() == 18) {
            return idcard.replaceAll("^(.{3})(.*)(.{3})", "$1************$3");
        } else {
            return idcard.replaceAll("^(.{3})(.*)(.{3})", "$1************$3");
        }
    }
}
