package cs.cshao.common.ext;

/**
 *
 * @author shaochen
 * @param <T1>
 */
@FunctionalInterface
public interface Action_1<T1> {

    /**
     * 应用
     *
     * @param t1 参数1
     */
    void apply(T1 t1);
}
