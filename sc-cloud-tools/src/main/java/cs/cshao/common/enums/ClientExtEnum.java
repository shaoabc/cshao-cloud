package cs.cshao.common.enums;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc 外部调用端枚举
 * @Author cshao
 * @Date 2022/12/10 16:05
 **/
public enum ClientExtEnum {

    GJ("GJ", "高济", "c31da0165fa191f97fe37a94babf0ae1"),
    CX("CX", "宸汐", "647458913508a2d1c875251a634b6a18"),
    ;

    @Getter
    private String code;
    @Getter
    private String desc;
    @Getter
    private String secret;

    @Data
    public static class Client{
        private String code;
        private String desc;

        public Client(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }


    @Getter
    private static final String enumType = "EXT_CLIENT";

    ClientExtEnum(String code, String desc, String secret) {
        this.code = code;
        this.desc = desc;
        this.secret = secret;
    }

    public static String getDescByCode(String code) {
        for (ClientExtEnum e : ClientExtEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.getDesc();
            }
        }
        return null;
    }

    public static String getSecretByCode(String code) {
        for (ClientExtEnum e : ClientExtEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.getSecret();
            }
        }
        return null;
    }

    public static List<Client> getObjectList() {
        ClientExtEnum[] $enum = ClientExtEnum.values();
        List<Client> objList = new ArrayList<>($enum.length);
        Arrays.stream($enum).forEach(e -> {
            objList.add(new Client(e.getCode(), e.getDesc()));
        });
        return objList;
    }
}
