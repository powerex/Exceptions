public class OperatorThrow {
    public static void main(String[] args) {
        Exception myException = new ArrayIndexOutOfBoundsException("In my super method");

        try {
            throw myException;
        } catch (Exception throwable) {
            System.out.println(throwable.getMessage());
            throwable.printStackTrace();
        }
    }
}
