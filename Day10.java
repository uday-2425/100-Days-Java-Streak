import java.util.*;

class day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (0 or 1): ");
        int first = sc.nextInt();
        boolean a = (first != 0); // Convert number to boolean

        System.out.print("Enter second number (0 or 1): ");
        int second = sc.nextInt();
        boolean b = (second != 0); // Convert number to boolean

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + !a);
        System.out.println("!b: " + !b);

        sc.close(); // Close Scanner
    }
}