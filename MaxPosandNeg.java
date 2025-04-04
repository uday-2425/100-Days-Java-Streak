import java.util.*;

public class MaxPosandNeg {
    public int maximumCount(int[] nums) {
        int pcount = 0;
        int ncount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pcount++;
            } else if (nums[i] < 0) {
                ncount++;
            }
        }
        
        return Math.max(pcount, ncount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        MaxPosandNeg obj = new MaxPosandNeg();
        int result = obj.maximumCount(nums);
        
        System.out.println("Maximum count of positive or negative numbers: " + result);
        
        sc.close();
    }
}
