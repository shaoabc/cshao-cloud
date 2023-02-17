package cs.cshao.common.exc;

import cs.cshao.common.exc.base.BaseException;

/**
 * @author shaochen
 */
public class ExtException extends BaseException {

    public ExtException(String msg) {
        super(msg);
    }

    public ExtException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public ExtException(int code, String msg) {
        super(code, msg);
    }

}
