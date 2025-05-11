import java.util.Scanner;

public class ThreeConsecutiveOdds {
    public static boolean hasThreeConsecutiveOdds(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 1) {
                count++;
                if (count == 3) return true;
            } else {
                count = 0; // reset if an even number is found
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements (space-separated): ");
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        boolean result = hasThreeConsecutiveOdds(arr);
        System.out.println("Output: " + result);
    }
}
