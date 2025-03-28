import java.util.Arrays;
import java.util.Scanner;

class Product_Except_Self {
    

    static int[] productExceptSelf(int[] arr) {
        int n = arr.length;

    
        int[] res = new int[n];
        Arrays.fill(res, 1);
        
        for (int i = 0; i < n; i++) {
        
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    res[i] *= arr[j];
                }
            }
        }

        return res;
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

      
        int[] res = productExceptSelf(arr);
        System.out.println("Product array (excluding self):");
        for (int val : res) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
