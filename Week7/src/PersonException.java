// making your own exceptions is easy!
// this is an example of a "checked" exception
// a try/catch block or "throws" method is required for it

// note that "unchecked exceptions" are derived from RunTimeException

public class PersonException extends Exception {
    public PersonException(String message) {
        super(message);
    }
}
