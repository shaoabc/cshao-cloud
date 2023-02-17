package cs.cshao.common.ext;

import java.io.Serializable;

/**
 * 只有一个参数和一个返回值函数
 * @param <T>
 * @param <TResult>
 */
@FunctionalInterface
public interface Func_1<T, TResult> extends Serializable {
    /**
     * 应用
     *
     * @param t 参数
     * @return 返回值
     */
    TResult apply(T t);
}
