package cs.cshao.common.enums;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc 权限类型
 * @Author cshao
 * @Date 2022/11/24 9:10
 **/
public enum PermissionEnum {

    MENU(490L, "菜单权限"),
    RESOURCE(500L, "资源权限");

    @Getter
    private final Long code;

    @Getter
    private final String desc;

    @Data
    public static class Permission {
        private Long code;
        private String desc;

        public Permission(Long code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }

    @Getter
    private static final String enumType = "PERMISSION_TYPE";

    PermissionEnum(Long code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDescByCode(Long code) {
        for (PermissionEnum e : PermissionEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.getDesc();
            }
        }
        return null;
    }

    public static List<Permission> getObjectList() {
        PermissionEnum[] $enum = PermissionEnum.values();
        List<Permission> objList = new ArrayList<>($enum.length);
        Arrays.stream($enum).forEach(e -> {
            objList.add(new Permission(e.getCode(), e.getDesc()));
        });
        return objList;
    }
}
