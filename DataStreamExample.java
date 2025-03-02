import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String args[]) {
        try {
            // Open the file input.txt for reading
            FileInputStream fin = new FileInputStream("input.txt");

            int i;
            System.out.println("File Content:");

            // Read and print each character until end of file (-1)
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

            // Close the file after reading
            fin.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
