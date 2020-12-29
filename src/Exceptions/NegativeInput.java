package Exceptions;

public class NegativeInput extends Exception {
    public NegativeInput() {
    }

    public NegativeInput(String message) {
        super(message);
    }

    public NegativeInput(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeInput(Throwable cause) {
        super(cause);
    }

    public NegativeInput(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
