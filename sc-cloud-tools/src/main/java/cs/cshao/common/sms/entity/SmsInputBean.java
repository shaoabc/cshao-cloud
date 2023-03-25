package cs.cshao.common.sms.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Desc: 短信发送实体
 * @Author: hub5
 * @Date: 2022/6/16 8:49
 **/
@Data
public class SmsInputBean implements Serializable {
    private static final long serialVersionUID = 941885061668797963L;
    private String sid;
    private String appid;
    private String templateCode;
    private String token;
    private String url;
    private String templateDesc;
    private String code;
    private String phone;
}
