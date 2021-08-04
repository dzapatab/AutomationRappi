package exceptions;

public class Exceptions extends AssertionError {

    public Exceptions(String message, Throwable cause) {
        super(message, cause);
    }
}