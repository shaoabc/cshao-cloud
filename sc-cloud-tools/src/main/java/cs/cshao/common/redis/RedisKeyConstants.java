package cs.cshao.common.redis;

/**
 * @Desc: 系统缓存key集合
 * @Author: hub5
 * @Date: 2022/4/5 14:31
 **/
public interface RedisKeyConstants {
    /**
     * key前缀，系统必须加此前缀
     */
    class BASE {

        // 企业后台缓存key前缀
        public static final String MANAGE_PREFIX = "HS:MANAGE:";

        // PHARMA应用缓存key前缀
        public static final String PHARMA_PREFIX = "HS:PHARMA:";

    }

    /**
     * Feign
     */
    class Feign {
        // 招募者模块key前缀
        public static final String FEIGN_BASE_PREFIX = "FEIGN:";
        // 暂存者积分导入缓存key
        public static final String TOKEN = BASE.MANAGE_PREFIX + FEIGN_BASE_PREFIX + "TOKEN";
    }

    /**
     * 志愿者
     */
    class Agent {
        // 志愿者模块key前缀
        public static final String AGENT_BASE_PREFIX = "AGENT:";
        // 志愿者导入缓存key
        public static final String SIGN_SMS = BASE.PHARMA_PREFIX + AGENT_BASE_PREFIX + "SIGNSMS:";
    }

    /**
     * 后台
     */
    class Manage {
        // 后台模块key前缀
        public static final String MANAGE_BASE_PREFIX = "MANAGE:";
        // 后台缓存key
        public static final String SIGN_SMS = BASE.PHARMA_PREFIX + MANAGE_BASE_PREFIX + "SIGNSMS:";
    }




}
