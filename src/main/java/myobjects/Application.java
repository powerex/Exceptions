package myobjects;

public class Application {
    public static void main(String[] args) {
        try {
            throw new MyException(new MyObject(42), "MY message");
        } catch (Exception e) {
            System.out.println("real cause " + ((MyException)e).getObject().getValue());
            e.printStackTrace();
        }

    }
}
