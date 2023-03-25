package cs.cshao.common.sms;

import cn.hutool.core.codec.Base64;
import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSON;
import cs.cshao.common.http.HttpUtils;
import cs.cshao.common.sms.entity.SmsBodyBean;
import cs.cshao.common.sms.entity.SmsInputBean;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Desc 发送短信工具类
 * @Author hub5
 * @Date 2022/11/17 16:55
 **/
@Slf4j
public class SendSmsUtil {

    public final static String CODE = "&code&";
    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    /**
     * @Desc 短信优化
     * @Author hub5
     * @Date 2022/6/16 9:37
     * @Return {@link }
     **/
    public static String send(SmsInputBean param) {
        String date = new SimpleDateFormat(YYYYMMDDHHMMSS).format(new Date());
        String auth = param.getSid() + ":" + date;
        Map<String, String> head = new HashMap<>();
        head.put("Accept", "application/json;");
        head.put("Content-Type", "application/json;charset=utf-8;");
        head.put("Authorization", Base64.encode(auth));

        String std = param.getSid() + param.getToken() + date;
        StringBuffer smsUrl = new StringBuffer();
        smsUrl.append(param.getUrl()).append(param.getSid())
                .append("/SMS/TemplateSMS").append("?sig=" + SecureUtil.md5(std));
        String data = param.getTemplateDesc().replace(CODE, param.getCode());
        SmsBodyBean body = new SmsBodyBean(param.getPhone()
                , param.getAppid(), param.getTemplateCode(), new String[]{data});
        return HttpUtils.doPost(smsUrl.toString(), JSON.toJSONString(body), head);
    }

}
