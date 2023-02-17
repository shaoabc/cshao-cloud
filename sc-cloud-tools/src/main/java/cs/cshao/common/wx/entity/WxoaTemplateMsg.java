package cs.cshao.common.wx.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Desc: 消息封装实体类
 * @Author: cshao
 * @Date: 2022/12/1 11:17
 **/
@Data
@ToString
public class WxoaTemplateMsg implements Serializable {
    private static final long serialVersionUID = -5488734905128387486L;
    /** 消息*/
    private String value;
    /** 消息颜色*/
    private String color;

    public WxoaTemplateMsg(String value) {
        this.value = value;
        this.color = "#173177";
    }

    public WxoaTemplateMsg(String value, String color) {
        this.value = value;
        this.color = color;
    }
}
