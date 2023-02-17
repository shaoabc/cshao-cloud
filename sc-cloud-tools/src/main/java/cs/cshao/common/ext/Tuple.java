package cs.cshao.common.ext;

import lombok.Getter;

import java.io.Serializable;

/**
 * 元组类型 单个
 * @param <T1>
 */
public class Tuple<T1> implements Serializable {
    private static final long serialVersionUID = -4340953436576826848L;

    /**
     * 项目1
     */
    @Getter
    private final T1 item1;

    /**
     * 构造函数
     *
     * @param item1 项目1
     */
    public Tuple(T1 item1) {
        this.item1 = item1;
    }

}
