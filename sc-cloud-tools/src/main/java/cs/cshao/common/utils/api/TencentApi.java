package cs.cshao.common.utils.api;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.faceid.v20180301.FaceidClient;
import com.tencentcloudapi.faceid.v20180301.models.IdCardVerificationRequest;
import com.tencentcloudapi.faceid.v20180301.models.IdCardVerificationResponse;
import cs.cshao.common.exc.UserException;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author cshao
 * @date 2022/12/15 15:46
 * @since 1.0.0
 */
@Slf4j
public class TencentApi {

    private static Credential cred = new Credential(
            "XXXXX",
            "XXXXX"
    );

    @Getter
    enum ResultCode {
        DAY_LIMIT_TIME_ERROR("999", "您当日认证次数已达上限，请检查身份信息，并于明日重试。"),
        AUTH_FAIL_ERROR("998", "实名认证未通过，请检查姓名、身份证号是否填写正确，当日剩余重试次数%d次。"),

        SUCCESS("0", "姓名和身份证号一致"),
        FAIL("-1", "姓名和身份证号不一致"),

        INVALID_LENGTH("-2", "非法身份证号（长度、校验位等不正确"),
        INVALID_NAME("-3", "非法姓名（长度、格式等不正确）"),
        SERVER_ERROR("-4", "证件库服务异常"),
        NO_RECORD("-5", "证件库中无此身份证记录"),

        ;

        private String code;
        private String desc;

        ResultCode(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }

    /**
     * @Desc 腾讯云身份证二要素认证
     * @Author cshao
     * @Date 2023/1/12 17:54
     **/
    public static void idCardVerification(String idCard, String name) {
        log.info("腾讯云身份证二要素认证：{},{}",idCard,name);
        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setEndpoint("faceid.tencentcloudapi.com");

        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);

        FaceidClient client = new FaceidClient(cred, "ap-beijing", clientProfile);

        IdCardVerificationRequest req = new IdCardVerificationRequest();
        req.setName(name);
        req.setIdCard(idCard);

        IdCardVerificationResponse resp = null;
        try {
            resp = client.IdCardVerification(req);
        } catch (TencentCloudSDKException e) {
            throw new UserException("认证服务异常，原因：" + e.getMessage());
        }
        if (!ResultCode.SUCCESS.getCode().equals(resp.getResult())) {
            // 计费计次
            if (ResultCode.FAIL.getCode().equals(resp.getResult())) {
                throw new UserException(ResultCode.AUTH_FAIL_ERROR.desc);
            }
            throw new UserException(resp.getDescription());
        }
    }
}
