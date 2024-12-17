import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EOFExceptionExample {
    public static void main(String[] args) {
        String filePath = "example.dat";

        // Step 1: Write some data to the file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(42); // Writing an integer
            dos.writeUTF("Hello, World!"); // Writing a string
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Step 2: Attempt to read beyond the end of the file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("Integer: " + dis.readInt());  // Read integer
            System.out.println("String: " + dis.readUTF());  // Read string

            // This read will cause EOFException since there's no more data
            System.out.println("Next Byte: " + dis.readByte());
        } catch (EOFException eof) {
            System.err.println("EOFException caught: Reached end of file unexpectedly!");
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
