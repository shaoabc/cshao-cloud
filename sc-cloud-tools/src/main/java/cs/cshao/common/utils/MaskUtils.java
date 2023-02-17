package cs.cshao.common.utils;


import java.util.Arrays;
import java.util.List;

/**
 * @Desc: 字段掩码
 * @Author: cshao
 * @Date: 2022/5/21 17:56
 **/
public class MaskUtils {

    private final static List<String> CHARSET = Arrays.asList(new String[]{"+", "<", ">", "#", "$", "%", "^", "&", "*", "-"});

    private final static List<String> EMP_CHARSET = Arrays.asList(new String[]{"#", "8", "S", "6", "N", "4", "A", "2", "H", "&"});
    /**
     * @Desc 个人名称掩码
     * @Author cshao
     * @Date 2022/5/21 17:59
     * @Return {@link }
     **/
    public static String personalNameMask(String name) {
        int strLen;
        if (name != null && (strLen = name.length()) != 0) {
            if (strLen == 1) {
                return name;
            } else if (strLen == 2) {
                return name.charAt(0) + "*";
            } else {
                String stars = "";
                for (int i = 0; (stars += "*").length() < (strLen - 2); i++) {
                    ;
                }
                return name.charAt(0) + stars + name.charAt(strLen - 1);
            }
        } else {
            return name;
        }
    }

    /**
     * @Desc 手机号掩码
     * @Author cshao
     * @Date 2022/5/21 17:59
     * @Return {@link }
     **/
    public static String cellPhoneNumberMask(String phone) {
        int strLen;
        if (phone != null && (strLen = phone.length()) != 0) {
            if (strLen > 6) {
                String destStr = phone.substring(3, strLen - 3);
                int destStrLen = destStr.length();
                String newStr = "";
                for (int i = 0; i < destStrLen; i++) {
                    if (Character.isDigit(destStr.charAt(i))) {
                        int index = Integer.parseInt(String.valueOf(destStr.charAt(i)));
                        newStr += CHARSET.get(index);
                    } else {
                        newStr += destStr.charAt(i);
                    }
                }
                return phone.substring(0, 3) + newStr + phone.substring(strLen - 3);
            } else {
                return phone;
            }
        } else {
            return phone;
        }
    }

    /**
     * @Desc 工号掩码
     * @Author cshao
     * @Date 2022/12/9 15:50
     * @Return {@link }
     **/
    public static String empNoMask(String empNo) {
        int strLen;
        if (empNo != null && (strLen = empNo.length()) != 0) {
            String newStr = "";
            for (int i = 0; i < strLen; i++) {
                if (Character.isDigit(empNo.charAt(i))) {
                    int index = Integer.parseInt(String.valueOf(empNo.charAt(i)));
                    newStr += EMP_CHARSET.get(index);
                } else {
                    newStr += empNo.charAt(i);
                }
            }
            return newStr;
        } else {
            return empNo;
        }
    }

    /**
     * @Desc 工号译码
     * @Author cshao
     * @Date 2022/12/9 15:50
     * @Return {@link }
     **/
    public static String empNoDecode(String code) {
        int strLen;
        if (code != null && (strLen = code.length()) != 0) {
            String newStr = "";
            for (int i = 0; i < strLen; i++) {
                int idx = EMP_CHARSET.indexOf(String.valueOf(code.charAt(i)));
                if (idx >= 0) {
                    newStr += idx;
                } else {
                    newStr += code.charAt(i);
                }
            }
            return newStr;
        } else {
            return code;
        }
    }
    /**
     * @Desc 长串号掩码（例如身份证号、银行卡号）
     * @Author cshao
     * @Date 2022/12/15 13:32
     * @Return {@link }
     **/
    public static String longStringNoMask(String stringNo) {
        int strLen;
        if (stringNo != null && (strLen = stringNo.length()) != 0) {
            if (strLen <= 12) {
                return stringNo;
            } else {
                String stars = "";
                for (int i = 0; (stars += "*").length() < (strLen - 12); i++) {
                    ;
                }
                return stringNo.substring(0, 6) + stars + stringNo.substring(strLen - 6);
            }
        } else {
            return stringNo;
        }
    }



    public static void main(String[] args) {
        System.out.println(longStringNoMask("sadadddddwqweqe"));
    }
}
