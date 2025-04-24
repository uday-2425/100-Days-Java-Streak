import java.util.*;

public class CompleteSubarrays {

    
    public static int countCompleteSubarrays(int[] nums) {
        int n = nums.length;

      
        Set<Integer> totalDistinct = new HashSet<>();
        for (int num : nums) {
            totalDistinct.add(num);
        }
        int distinctCount = totalDistinct.size();

        int count = 0;

       
        for (int i = 0; i < n; i++) {
            Set<Integer> subSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                subSet.add(nums[j]);
                if (subSet.size() == distinctCount) {
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

        // Calculating result and printing it
        int result = countCompleteSubarrays(nums);
        System.out.println("Number of complete subarrays: " + result);
    }
}
