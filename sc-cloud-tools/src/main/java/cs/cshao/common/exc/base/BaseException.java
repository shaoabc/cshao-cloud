package cs.cshao.common.exc.base;

import lombok.Getter;

/**
 * 自定义异常基类
 * @author shaochen
 */
@Getter
public abstract class BaseException extends RuntimeException {
    private static final long serialVersionUID = -3625176806200591575L;

    private int code;

    public BaseException(String msg) {
        super(msg);
    }

    public BaseException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public BaseException(int code, String msg) {
        super(msg);
        this.code = code;
    }

}
