package cs.cshao.common.wx;

import com.alibaba.fastjson.JSONObject;
import cs.cshao.common.exc.UserException;
import cs.cshao.common.http.Http;
import cs.cshao.common.utils.string.StringUtils;
import cs.cshao.common.wx.entity.WxoaAccessBean;
import cs.cshao.common.wx.entity.WxoaSnsAccessBean;
import cs.cshao.common.wx.entity.WxoaTemplateConf;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @Desc: 微信工具类
 * @Author: cshao
 * @Date: 2022/12/1 0:08
 **/
@Component
@AllArgsConstructor
@Slf4j
public class WeChatUtils {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    /**
     * @Desc 获取AccessToken
     * @Author hub5
     * @Date 2022/5/31 23:24
     * @Return {@link }
     **/
    public String getWxAccessToken(String appId, String secret) {
        if (StringUtils.isNotBlank(appId) && StringUtils.isNotBlank(secret)) {
            String tokenKey = appId + secret;
            if (this.redisTemplate.hasKey(tokenKey)) {
                return (String) this.redisTemplate.opsForValue().get(tokenKey);
            }
            StringBuffer getTokenUrl = new StringBuffer()
                    .append("https://api.weixin.qq.com/cgi-bin/token")
                    .append("?grant_type=client_credential")
                    .append("&appid=" + appId)
                    .append("&secret=" + secret);
            String body = null;
            try {
                body = Http.get(getTokenUrl.toString());
            } catch (IOException e) {
                log.info("请求accessToken异常：{}", e.getMessage());
            }
            if (StringUtils.isNotBlank(body)) {
                // 转成JSON对象
                WxoaAccessBean accessBean = JSONObject.parseObject(body, WxoaAccessBean.class);
                String accessToken = null;
                if (null != accessBean && StringUtils.isNotBlank(accessToken = accessBean.getAccessToken())) {
                    this.redisTemplate.opsForValue().set(tokenKey, accessToken, accessBean.getExpiresIn(), TimeUnit.SECONDS);
                    return accessToken;
                }
            }
        }
        return null;
    }

    /**
     * @Desc 发送公众号模板消息
     * @Author cshao
     * @Date 2022/12/1 11:24
     * @Return {@link }
     **/
    public String sendWxoaTemplateMsg(String accessToken, WxoaTemplateConf confBody) {
        if (StringUtils.isBlank(accessToken)) {
            throw new UserException("未获取到accessToken!");
        } else {
            String url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=" + accessToken;
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> forEntity = restTemplate.postForEntity(url, confBody, String.class);
            return forEntity.getBody();
        }
    }

    /**
     * @Desc 获取微信公众号openId
     * @appId 公众号appID
     * @secret 公众号secret
     * @Author cshao
     * @Date 2022/12/2 15:23
     * @Return {@link }
     **/
    public String getWxoaOpenId(String appId, String secret, String code) {
        if (StringUtils.isBlank(appId)
                || StringUtils.isBlank(secret)
                || StringUtils.isBlank(code)) {
            throw new UserException("appId或secret或code缺失！");
        } else {
            try {
                StringBuffer getOpenIdUrl = new StringBuffer()
                        .append("https://api.weixin.qq.com/sns/oauth2/access_token")
                        .append("?appid=" + appId)
                        .append("&secret=" + secret)
                        .append("&code=" + code)
                        .append("&grant_type=authorization_code");
                String snsAccess =  Http.get(getOpenIdUrl.toString());
                WxoaSnsAccessBean accessBean = JSONObject.parseObject(snsAccess, WxoaSnsAccessBean.class);
                return accessBean.getWxoaOpenId();
            } catch (IOException e) {
                throw new UserException("获取公众号openId发生异常：" + e.getMessage());
            }
        }
    }
}
