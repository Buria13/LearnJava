package errorssextentions;

public class ResourceExceptions extends Exception {
    public ResourceExceptions() {
    }

    public ResourceExceptions(String message) {
        super(message);
    }

    public ResourceExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceExceptions(Throwable cause) {
        super(cause);
    }
}
