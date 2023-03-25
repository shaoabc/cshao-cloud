package cs.cshao.common.enums;
/*
 * @author cshao
 * @time 2022/3/19
 * @desc WeChatLoginErrorCode
 */

import lombok.Getter;

@Getter
public enum WxErrorCode {


    success(0, "请求成功"),
    fail(-1, "系统繁忙，此时请开发者稍候再试"),
    fail_40029(40029, "code 无效"),
    fail_45011(45011, "频率限制，每个用户每分钟100次"),
    fail_40003(40003, "openid 错误"),
    fail_89002(89002, "没有绑定开放平台帐号"),
    fail_89300(89300, "订单无效" ),
    fail_40001(40001, "AppSecret 错误或者 AppSecret 不属于这个小程序，请开发者确认 AppSecret 的正确性" ),
    fail_40002(40002, "请确保 grant_type 字段值为 client_credential" ),
    fail_40013(40013, "不合法的 AppID，请开发者检查 AppID 的正确性，避免异常字符，注意大小写" );

    private int errCode;
    private String errMsg;
    private static final WxErrorCode[] loginErrMsg = WxErrorCode.values();

    WxErrorCode(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    /**
     * @desc 获取平台标识
     * @param
     * @return
     */
    public static String getErrMsg(int errCode) {
        for (WxErrorCode rct : loginErrMsg) {
            if (rct.getErrCode() == errCode) {
                return rct.getErrMsg();
            }
        }
        return null;
    }


}
