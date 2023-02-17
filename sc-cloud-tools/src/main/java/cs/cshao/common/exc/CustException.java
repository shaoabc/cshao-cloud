package cs.cshao.common.exc;

/**
 * @author shaochen
 */
public class CustException extends RuntimeException {
    public CustException() {
    }

    public CustException(String message) {
        super(message);
    }

    public CustException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustException(Throwable cause) {
        super(cause);
    }

    public CustException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
