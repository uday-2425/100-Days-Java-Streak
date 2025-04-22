import java.util.*;

public class Minimum {

    public static int minOperations(int[] nums, int k) {
        for (int num : nums) {
            if (num < k) return -1;
        }

        Set<Integer> greaterThanK = new HashSet<>();
        for (int num : nums) {
            if (num > k) {
                greaterThanK.add(num);
            }
        }

        if (greaterThanK.isEmpty()) {
            for (int num : nums) {
                if (num != k) return -1;
            }
            return 0;
        }

        List<Integer> list = new ArrayList<>(greaterThanK);
        Collections.sort(list, Collections.reverseOrder());

        int operations = 0;
        int current = list.get(0);
        operations++;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == current) continue;
            current = list.get(i);
            operations++;
        }

        if (k < current) {
            operations++;
        } else if (k > current) {
            return -1;
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 2, 5, 4, 5};
        int k1 = 2;
        System.out.println("Output 1: " + minOperations(nums1, k1)); // Output: 2

        int[] nums2 = {2, 1, 2};
        int k2 = 2;
        System.out.println("Output 2: " + minOperations(nums2, k2)); // Output: -1

        int[] nums3 = {9, 7, 5, 3};
        int k3 = 1;
        System.out.println("Output 3: " + minOperations(nums3, k3)); // Output: 4
    }
}
