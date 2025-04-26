import java.util.Scanner;

public class ColoredCellsGrid {


    public static int coloredCells(int n) {
        return 2 * n * (n - 1) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of minutes (n): ");
        int n = scanner.nextInt();

       
        int result = coloredCells(n);
        System.out.println("Number of colored cells after " + n + " minutes: " + result);
    }
}
