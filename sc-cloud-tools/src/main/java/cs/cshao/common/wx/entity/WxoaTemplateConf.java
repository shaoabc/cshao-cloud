package cs.cshao.common.wx.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;

/**
 * @Desc: 消息封装实体类 （模板参数）
 * @Author: cshao
 * @Date: 2022/12/1 11:17
 **/
@Data
@ToString
public class WxoaTemplateConf implements Serializable {
    private static final long serialVersionUID = 6092034799458723786L;
    private String touser;
    private String template_id;
    private String topcolor;
    private String url;
    private Map<String, WxoaTemplateMsg> data;
}
