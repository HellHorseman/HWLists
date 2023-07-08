package pro.sky.listExample.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongTypeException extends RuntimeException {
    public WrongTypeException() {
    }

    public WrongTypeException(String message) {
        super(message);
    }

    public WrongTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongTypeException(Throwable cause) {
        super(cause);
    }

    public WrongTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
