package cs.cshao.common.wx.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * @Desc: 获取公众号openId
 * @Author: cshao
 * @Date: 2022/12/6 15:03
 **/
@Data
public class WxoaSnsAccessBean implements Serializable {
    private static final long serialVersionUID = -712906063772744082L;
    @JSONField(name = "access_token")
    private String accessToken;

    @JSONField(name = "expires_in")
    private long expiresIn;

    @JSONField(name = "refresh_token")
    private String refreshToke;

    @JSONField(name = "openid")
    private String wxoaOpenId;

    @JSONField(name = "scope")
    private String scope;
}
