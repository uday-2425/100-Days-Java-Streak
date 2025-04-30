import java.util.Scanner;

public class EvenDigitCount {

   
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = (int) Math.log10(num) + 1;
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        
        int result = findNumbers(nums);
        System.out.println("Count of numbers with even number of digits: " + result);

        scanner.close();
    }
}
