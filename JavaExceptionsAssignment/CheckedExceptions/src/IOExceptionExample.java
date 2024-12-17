import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: File not found or other I/O error.");
        }
    }
}
