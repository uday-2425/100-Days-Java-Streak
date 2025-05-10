import java.util.*;

public class MinimumEqualSum {
    public static int minimumEqualSum(int[] nums1, int[] nums2) {
        int sum1 = 0, sum2 = 0;
        int zeroCount1 = 0, zeroCount2 = 0;

        for (int num : nums1) {
            if (num == 0) zeroCount1++;
            else sum1 += num;
        }

        for (int num : nums2) {
            if (num == 0) zeroCount2++;
            else sum2 += num;
        }

        int minAdd1 = zeroCount1; // Replace each 0 in nums1 with 1
        int minAdd2 = zeroCount2; // Replace each 0 in nums2 with 1

        int totalMin1 = sum1 + minAdd1;
        int totalMin2 = sum2 + minAdd2;

        int diff = Math.abs(totalMin1 - totalMin2);

        // Check feasibility
        if (totalMin1 == totalMin2) return totalMin1;

        if (totalMin1 < totalMin2) {
            int extra = totalMin2 - totalMin1;
            if (extra > 9 * zeroCount1) return -1;
            return totalMin2;
        } else {
            int extra = totalMin1 - totalMin2;
            if (extra > 9 * zeroCount2) return -1;
            return totalMin1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nums1 (space-separated): ");
        String[] input1 = sc.nextLine().split(" ");
        int[] nums1 = new int[input1.length];
        for (int i = 0; i < input1.length; i++) {
            nums1[i] = Integer.parseInt(input1[i]);
        }

        System.out.print("Enter nums2 (space-separated): ");
        String[] input2 = sc.nextLine().split(" ");
        int[] nums2 = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            nums2[i] = Integer.parseInt(input2[i]);
        }

        int result = minimumEqualSum(nums1, nums2);
        System.out.println("Output: " + result);
    }
}
