import java.util.*;

public class MinimumSwaps {
    
    static int minSwaps(int[] arr) {
        int countOne = 0;
        int n = arr.length;

        
        for (int num : arr) {
            if (num == 1)
                countOne++;
        }
        if (countOne == 0)
            return 0;

        
        int minSwap = Integer.MAX_VALUE;
        for (int i = 0; i <= n - countOne; i++) {
            int oneCount = 0;
            for (int j = i; j < i + countOne; j++) {
                if (arr[j] == 1)
                    oneCount++;
            }
            minSwap = Math.min(minSwap, countOne - oneCount);
        }

        return minSwap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        System.out.println("Enter the array elements (0s and 1s only):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.println("Minimum swaps required: " + minSwaps(arr));

        sc.close();
    }
}
