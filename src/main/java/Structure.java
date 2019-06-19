import java.io.IOException;
import java.util.Arrays;

public class Structure {
    public static void main(String[] args) {
        int size = (int) (Math.random()*4);
        System.out.println(size);
        int [] arr = new int[size];
        try {
            int x = 1/size;
            arr[3] = 2;
            System.out.println("Success");
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("Something goes wrong");
            System.out.println("Division by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("In ArrayIndexOutOfBoundsException");
            arr = new int[size+5];
            arr[3] = 2;
        }
        catch (Throwable e) {
            System.out.println("Common exception");
        }
        finally {
            System.out.println("In finally");
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("After catch");
    }
}
