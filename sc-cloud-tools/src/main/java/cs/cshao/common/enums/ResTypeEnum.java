package cs.cshao.common.enums;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc 资源类型（0文本；1图像；3视频；4音频）
 * @Author cshao
 * @Date 2022/12/7 10:15
 **/
public enum ResTypeEnum {

    TEXT_FILE(0,"文本文件"),
    PHOTO_FILE(1,"图片文件"),
    VIDEO_FILE(2,"视频文件"),
    AUDIO_FILE(3,"音频文件");

    @Getter
    private final Integer code;

    @Getter
    private final String desc;

    @Data
    public static class Type {
        private Integer code;
        private String desc;

        public Type(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }

    ResTypeEnum(Integer value, String desc) {
        this.code = value;
        this.desc = desc;
    }

    public static String getDescByCode(Integer code) {
        for (ResTypeEnum e : ResTypeEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.getDesc();
            }
        }
        return null;
    }

    public static List<Type> getObjectList() {
        ResTypeEnum[] $enum = ResTypeEnum.values();
        List<Type> objList = new ArrayList<>($enum.length);
        Arrays.stream($enum).forEach(e -> {
            objList.add(new Type(e.getCode(), e.getDesc()));
        });
        return objList;
    }
}
