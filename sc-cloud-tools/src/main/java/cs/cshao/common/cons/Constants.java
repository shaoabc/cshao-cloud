package cs.cshao.common.cons;


import javax.servlet.http.HttpServletResponse;

/**
 * 公共常量
 * @author shaochen
 */
public class Constants {
    public static final int SUCCESS_CODE = 0;
    public static final String SUCCESS_MSG = "操作成功";
    public static final int FAIL_CODE = 1;
    public static final String FAIL_MSG = "请稍后重试";
    public static final String LOGIN_FAIL = "登录失败";
    public static final String NOT_LOGIN = "用户没有登录";
    public static final String TOKEN_EXPIRE_MSG = "会话已过期，请重新登录";
    public static final String TOKEN_INVALID_MSG = "令牌已失效，请重新登录";
    public static final String NOT_AUTH = "权限不足";
    public static final String PASSWORD_CHECK_FAIL = "密码校验不通过";
    public static final String OLD_PASSWORD_CHECK_FAIL = "原始密码校验不通过";
    public static final String ASSETS_PASSWORD_CHECK_FAIL = "资金密码校验不通过";
    public static final String REGISTER_FAIL = "注册失败";
    public static final String USER_NOT_EXIST = "用户不存在";
    public static final String USER_EXIST = "用户已存在";
    public static final String ID_CARD_FAIL = "身份证号校验不通过";

    public static final String PARAM_NOT_ALLOW_NULL = "必填参数不能为空";
    public static final String PARAM_ERROR = "参数错误";

    public static final String PROJECT_ID_KEY = "PROJECT_ID";
    public static final String USER_ID_KEY = "USER_ID";
    public static final String PAGE_SIZE = "pageSize";
    public static final String PAGE_NUM = "pageNum";
    public static final String USER_ID = "userId";

    /**
     * 微信短信验证码Redis缓存前缀
     */
    public static final String SMS_MSG_REDIS_PREFIX = "sms:send:wechatmsg:";

    /**
     * 短信验证码过期时间设置（秒）
     */
    public static final Integer SMS_CODE_OVERTIME_PREFIX = 60 * 5;

    /**
     * 鉴权失败后返回的HTTP错误码，默认为401
     */
    public static final int UNAUTHORIZED_ERROR_CODE = HttpServletResponse.SC_UNAUTHORIZED;

    /**
     * 通过`code`换取网页授权`access_token`和`openid` - GET请求
     */
    public static final String AUTH_GET_ACCESS_TOKEN_AND_OPENID = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";

    /**
     * 检验授权凭证（access_token）是否有效 - GET请求
     */
    public static final String AUTH_CHECK_ACCESS_TOKEN = "https://api.weixin.qq.com/sns/auth?access_token=ACCESS_TOKEN&openid=OPENID";

    /**
     * 获取用户信息(需scope为 `snsapi_userinfo`) - GET请求
     */
    public static final String AUTH_GET_USER_INFO = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
    /**
     * 请求ticket
     */
    public final static String ticket_url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=ACCESS_TOKEN";

    /**
     * 请求二维码
     */
    public final static String QRcode_url = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=TICKET";

}
