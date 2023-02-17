package cs.cshao.common.exc;

/**
 * token失效或无效异常
 */
public class FailTokenException extends RuntimeException {


    public FailTokenException() {
    }

    public FailTokenException(String message) {
        super(message);
    }

    public FailTokenException(String message, Throwable cause) {
        super(message, cause);
    }

    public FailTokenException(Throwable cause) {
        super(cause);
    }

    public FailTokenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
