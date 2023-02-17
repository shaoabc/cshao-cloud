package cs.cshao.common.utils.sequence;


import cs.cshao.common.utils.sequence.handler.SnowFlakeIDWorker;

/**
 * 雪花算法工具类
 * @author shaochen
 */
public class SnowFlakeIDUtils {

    public static String generateId(String prefix) {
        return SnowFlakeIDWorker.idWorker().generateId(prefix);
    }

    public static Long nextLongId() {
        return SnowFlakeIDWorker.idWorker().nextId();
    }

}
