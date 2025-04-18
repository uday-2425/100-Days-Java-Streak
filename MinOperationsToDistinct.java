import java.util.*;

public class MinOperationsToDistinct {
    public static int minOperations(int[] nums) {
        int operations = 0;
        int i = 0;

        while (i < nums.length) {
            // Remove first 3 elements (simulate by skipping index)
            i += 3;
            operations++;

            // Check if the rest is distinct
            Set<Integer> seen = new HashSet<>();
            boolean hasDuplicate = false;

            for (int j = i; j < nums.length; j++) {
                if (!seen.add(nums[j])) {
                    hasDuplicate = true;
                    break;
                }
            }

            if (!hasDuplicate) {
                break;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = minOperations(nums);
        System.out.println("Minimum operations: " + result);
    }
}
