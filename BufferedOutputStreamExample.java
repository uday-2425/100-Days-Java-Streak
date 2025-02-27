import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String args[]) {
        try (
            // Using try-with-resources to automatically close resources
            FileOutputStream fout = new FileOutputStream("test.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout)
        ) {
            String s = "Welcome to Java"; // Fixed capitalization for consistency
            byte[] b = s.getBytes();

            bout.write(b); // Writing data to the file
            bout.flush();  // Ensuring data is written before closing

            System.out.println("Success");
        } catch (IOException e) {  // More specific exception handling
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
