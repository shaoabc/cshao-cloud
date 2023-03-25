package cs.cshao.common.redis.template;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Redis客户端操作类
 */
public interface IRedisBaseTemplate
        extends BeanPostProcessor, IRedisKeyTemplate, IRedisListTemplate, IRedisSetTemplate, IRedisValueTemplate,
        IRedisHashTemplate {

    /**
     * Redis命令操作结果：成功
     */
    Long OPERATE_RESULT_TRUE = 1L;

    /**
     * Redis命令操作结果：失败
     */
    Long OPERATE_RESULT_FALSE = 0L;

}