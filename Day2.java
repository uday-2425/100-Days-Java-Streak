import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        System.out.println("Multiples of " + number + " up to 10 are:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number+"*"+i+"="+(number * i));
        }

        
        scanner.close();
    }
}
