import java.util.Scanner;

public class CountSymmetricIntegers {

   
    public static boolean isSymmetric(int num) {
        String s = Integer.toString(num);
        int len = s.length();

        
        if (len % 2 != 0) return false;

        int mid = len / 2;
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < mid; i++) {
            sum1 += s.charAt(i) - '0';
        }

        for (int i = mid; i < len; i++) {
            sum2 += s.charAt(i) - '0';
        }

        return sum1 == sum2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter low: ");
        int low = sc.nextInt();

        System.out.print("Enter high: ");
        int high = sc.nextInt();

        int count = 0;
        System.out.print("Symmetric integers between " + low + " and " + high + ": ");
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nOutput: " + count);
    }
}
