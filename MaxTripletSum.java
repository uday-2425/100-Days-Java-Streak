import java.util.*;

public class MaxTripletSum {
    public static int maxSumTriplet(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;

        Arrays.sort(arr);
        return arr[n - 1] + arr[n - 2] + arr[n - 3];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        if (n < 3) {
            System.out.println("At least 3 positive numbers are required.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " positive integers:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val <= 0) {
                System.out.println("Only positive integers are allowed.");
                return;
            }
            arr[i] = val;
        }

        int result = maxSumTriplet(arr);
        System.out.println("Maximum Sum of Triplet: " + result);
    }
}
