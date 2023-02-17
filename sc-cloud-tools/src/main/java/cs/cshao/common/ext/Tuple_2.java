package cs.cshao.common.ext;

import lombok.Getter;

/**
 * 元组类型 2个
 * @param <T1>
 * @param <T2>
 */
public class Tuple_2<T1, T2> extends Tuple<T1> {

    private static final long serialVersionUID = 8370774750834888215L;
    /**
     * 项目2
     */
    @Getter
    private final T2 item2;

    /**
     * 构造函数
     *
     * @param item1 项目1
     * @param item2 项目2
     */
    public Tuple_2(T1 item1, T2 item2) {
        super(item1);
        this.item2 = item2;
    }
}
