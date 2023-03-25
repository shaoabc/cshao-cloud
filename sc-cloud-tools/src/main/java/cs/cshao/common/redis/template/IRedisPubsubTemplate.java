package cs.cshao.common.redis.template;

import java.util.Map;

/**
 * Redis Pubsub Operation Template
 */
public interface IRedisPubsubTemplate {

    /**
     * 将信息 message 发送到指定的频道 channel
     * 返回，收到消息的客户端数量
     *
     * @param channel
     * @param message
     *
     * @return
     */
    Long publish(String channel, String message);

    /**
     * TODO 不使用
     *
     * @param channels
     *
     * @return
     */
    Map<String, String> pubsubNumSub(String... channels);

    /**
     * TODO 不使用
     *
     * @param patterns
     *
     * @return
     */
    Long pubsubNumPat(String... patterns);

}
