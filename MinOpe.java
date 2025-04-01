import java.util.*;

public class MinOpe {
    public static int minOps(int[] arr) {
        int n = arr.length;
        int cnt = 0;

        Arrays.sort(arr);  

        while (arr[0] != arr[n - 1]) {
            for (int i = 0; i < n - 1; i++) {
                arr[i]++;  
            }
            cnt++;
            Arrays.sort(arr);
        }
        return cnt;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Minimum operations required: " + minOps(arr));  
        sc.close();
    }
}
