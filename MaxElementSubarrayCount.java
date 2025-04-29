import java.util.Scanner;

public class MaxElementSubarrayCount {

    
    public static int countSubarrays(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            int max = nums[start];
            int maxFreq = 0;

            for (int end = start; end < n; end++) {
             
                if (nums[end] > max) {
                    max = nums[end];
                    maxFreq = 1;
                } else if (nums[end] == max) {
                    maxFreq++;
                }

                if (maxFreq >= k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

      
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

       
        int result = countSubarrays(nums, k);
        System.out.println("Number of valid subarrays: " + result);
    }
}
