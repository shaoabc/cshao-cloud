package cs.cshao.common.sms.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Desc: 短信发送实体
 * @Author: hub5
 * @Date: 2022/6/16 8:49
 **/
@Data
public class SmsBodyBean implements Serializable {
    private static final long serialVersionUID = 3689102967187846944L;
    private String to;
    private String appId;
    private String templateId;
    private String[] datas;

    public SmsBodyBean(String to, String appId, String templateId, String[] datas) {
        this.to = to;
        this.appId = appId;
        this.templateId = templateId;
        this.datas = datas;
    }
}
