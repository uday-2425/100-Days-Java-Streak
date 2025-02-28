import java.util.*;

class TestArray3 {
    public static void main(String[] args) {
        int len;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length of array one: ");
        len = sc.nextInt();
        int a[] = new int[len];
        
        System.out.println("Enter " + len + " elements to store in array one:");
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Elements in array one are:");
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println("\nEnter length of array two: ");
        int size = sc.nextInt();
        double b[] = new double[size];
        
        System.out.println("Enter " + size + " elements to store in array two:");
        for (int i = 0; i < size; i++) {
            b[i] = sc.nextDouble();
        }
        
        System.out.println("Elements in array two are:");
        for (int i = 0; i < size; i++) {
            System.out.print(b[i] + " ");
        }
        
        sc.close(); // Close the scanner
    }
}