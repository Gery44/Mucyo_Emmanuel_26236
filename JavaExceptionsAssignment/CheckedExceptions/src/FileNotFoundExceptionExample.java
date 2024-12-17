// Java code to illustrate IOException
import java.io.*;

// Driver Class
public class FileNotFoundExceptionExample {
    // Main Function
    public static void main(String[] args) throws IOException
    {
        // Code that may contain exception must be written
        // inside try block
        try {
            // FileReader object
            FileReader file = new FileReader("file.txt");

            // Trying to read a file that doesn't exists
            System.out.println(file.read());
        }

        // Code to handle exception must be inside catch
        // block
        catch (Exception exp) {
            // Piece of code to handle issue

            // Printing error
            System.out.println("Error occured: "
                    + exp.getMessage());
        }

        // Code that must be executed always
        finally {
            // Code that must be executed
            System.out.println(
                    "Finally block will always executed, irrespective of occurence of issue");
        }
    }
}