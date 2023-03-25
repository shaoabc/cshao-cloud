package cs.cshao.common.enums;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc 平台端枚举
 * @Author cshao
 * @Date 2022/12/10 16:05
 **/
public enum ClientOriginEnum {

    SLL_PTS("1", "患者端", "59d7a7013ced141c44db5187bdb92664"),
    SLL_PLAT("2", "后台管理端", "a9217f466ef8d162749199773debd929"),
    SLL_AGENT("3", "志愿者端", "8865be8446b37e88ad3f5136dc5971a0"),
    ;

    @Getter
    private String code;
    @Getter
    private String desc;

    @Getter
    private String secret;

    @Data
    public static class Origin{
        private String code;
        private String desc;

        public Origin(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }


    @Getter
    private static final String enumType = "CLIENT_ORIGIN";

    ClientOriginEnum(String code, String desc, String secret) {
        this.code = code;
        this.desc = desc;
        this.secret = secret;
    }

    public static String getDescByCode(String code) {
        for (ClientOriginEnum e : ClientOriginEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.getDesc();
            }
        }
        return null;
    }

    public static String getSecretByCode(String code) {
        for (ClientOriginEnum e : ClientOriginEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.getSecret();
            }
        }
        return null;
    }

    public static List<Origin> getObjectList() {
        ClientOriginEnum[] $enum = ClientOriginEnum.values();
        List<Origin> objList = new ArrayList<>($enum.length);
        Arrays.stream($enum).forEach(e -> {
            objList.add(new Origin(e.getCode(), e.getDesc()));
        });
        return objList;
    }
}
