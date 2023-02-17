package cs.cshao.common.ext;

/**
 * @Desc 具有两个参数无返回值的Action
 * @Author cshao
 * @Date 2022/11/8 13:23
 **/
@FunctionalInterface
public interface Action_2<T1, T2> {

    /**
     * 应用
     *
     * @param t1 参数1
     * @param t2 参数2
     */
    void apply(T1 t1, T2 t2);
}
