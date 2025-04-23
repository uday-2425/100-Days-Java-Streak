import java.util.*;

public class LargestGroupSize {

 
    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

   
    public static int countLargestGroup(int n) {
        Map<Integer, Integer> groupSizes = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            groupSizes.put(sum, groupSizes.getOrDefault(sum, 0) + 1);
        }

        int maxSize = 0;
        for (int size : groupSizes.values()) {
            maxSize = Math.max(maxSize, size);
        }

        int count = 0;
        for (int size : groupSizes.values()) {
            if (size == maxSize) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        int result = countLargestGroup(n);
        System.out.println("Number of groups with the largest size: " + result);
    }
}
