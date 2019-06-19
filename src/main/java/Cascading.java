import java.io.*;

public class Cascading {
    public static void main(String[] args) {
        try (FileOutputStream file = new FileOutputStream("file.txt");
             BufferedOutputStream buff = new BufferedOutputStream(file)) {
            buff.write(123);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
