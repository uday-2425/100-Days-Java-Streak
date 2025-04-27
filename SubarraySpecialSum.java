import java.util.Scanner;

public class SubarraySpecialSum {
    
    // Function to count valid subarrays
    public static int countSpecialSubarrays(int[] nums) {
        int count = 0;
        
        // Loop through subarrays of length 3
        for (int i = 0; i <= nums.length - 3; i++) {
            int first = nums[i];
            int second = nums[i + 1];
            int third = nums[i + 2];
            
            if (first + third == second / 2) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = countSpecialSubarrays(nums);
        System.out.println("Number of special subarrays of length 3: " + result);

        scanner.close();
    }
}
