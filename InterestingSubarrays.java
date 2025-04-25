import java.util.*;

public class InterestingSubarrays {

    public static long countInterestingSubarrays(int[] nums, int modulo, int k) {
        Map<Integer, Long> prefixCount = new HashMap<>();
        prefixCount.put(0, 1L);  
        long result = 0;
        int count = 0;

        for (int num : nums) {
            if (num % modulo == k) {
                count++;
            }

            
            int currentMod = ((count - k) % modulo + modulo) % modulo;

         
            result += prefixCount.getOrDefault(currentMod, 0L);

            
            int modCount = count % modulo;
            prefixCount.put(modCount, prefixCount.getOrDefault(modCount, 0L) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        
        System.out.print("Enter modulo value: ");
        int modulo = scanner.nextInt();
        System.out.print("Enter k value: ");
        int k = scanner.nextInt();

        long result = countInterestingSubarrays(nums, modulo, k);
        System.out.println("Count of interesting subarrays: " + result);

        scanner.close();
    }
}
