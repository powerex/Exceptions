package myobjects;

public class MyException extends Exception {
    private MyObject object;

    public MyObject getObject() {
        return object;
    }

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(MyObject object, String message) {
        this(message);
        this.object = object;
    }
}
