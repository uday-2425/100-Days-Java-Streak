import java.util.Scanner;

class RotateArray {

    static void rotateArr(int[] arr, int d) {
        int n = arr.length;

        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

      
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.print("Enter the number of positions to rotate: ");
        int d = sc.nextInt();
        d = d % n; 

        rotateArr(arr, d);

       
        System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
