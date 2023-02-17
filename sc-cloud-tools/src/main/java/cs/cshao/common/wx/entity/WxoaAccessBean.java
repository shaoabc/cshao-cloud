package cs.cshao.common.wx.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * @Desc 公众号
 * @Author cshao
 * @Date 2022/12/31 23:55
 * @Return {@link }
 **/
@Data
public class WxoaAccessBean implements Serializable {
    private static final long serialVersionUID = -5019093317639843435L;

    @JSONField(name = "access_token")
    private String accessToken;

    @JSONField(name = "expires_in")
    private long expiresIn;

}
