package cs.cshao.common.enums;

import lombok.Getter;

/**
 * @description:  唯二状态，二选一
 * @Author: cshao
 * @Date: 2022/3/26 15:19
 **/
public enum AlterByteEnum {

    YES((byte)1, "是", "可用", "通过", "男", "完成"),
    NOT((byte)0, "否", "不可用", "不通过", "女", "未完成");

    @Getter
    private Byte code;
    @Getter
    private String alias1;
    @Getter
    private String alias2;
    @Getter
    private String alias3;
    @Getter
    private String alias4;
    @Getter
    private String alias5;

    @Getter
    private static final String enumType = "ALTER_BYTE";

    AlterByteEnum(Byte code, String alias1
            , String alias2, String alias3
            , String alias4, String alias5) {
        this.code = code;
        this.alias1 = alias1;
        this.alias2 = alias2;
        this.alias3 = alias3;
        this.alias4 = alias4;
        this.alias5 = alias5;
    }
}
