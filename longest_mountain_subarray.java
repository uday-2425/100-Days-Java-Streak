import java.util.*;

public class longest_mountain_subarray {
    public static int findLongestMountain(int[] a) {
        int ans = 0;
        int n = a.length;
        
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int inc = 0, dec = 0;

            while (j < n && a[j] > a[j - 1]) {
                inc = 1;
                j++;
            }

            while (j < n && a[j] < a[j - 1]) {
                dec = 1;
                j++;
            }

            if (inc == 1 && dec == 1) {
                ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] d = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        
        System.out.println(findLongestMountain(d));
        sc.close();
    }
}
