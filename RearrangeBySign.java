import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class RearrangeBySign {


    static void rightRotate(ArrayList<Integer> arr, int start, int end) {
        int temp = arr.get(end);
        for (int i = end; i > start; i--) {
            arr.set(i, arr.get(i - 1));
        }
        arr.set(start, temp);
    }


    static void rearrange(ArrayList<Integer> arr) {
        int n = arr.size();

        for (int i = 0; i < n; i++) {
   
            if (arr.get(i) >= 0 && i % 2 == 1) {
          
                for (int j = i + 1; j < n; j++) {
                    if (arr.get(j) < 0) {
                        rightRotate(arr, i, j);
                        break;
                    }
                }
            }
 
            else if (arr.get(i) < 0 && i % 2 == 0) {

                for (int j = i + 1; j < n; j++) {
                    if (arr.get(j) >= 0) {
                        rightRotate(arr, i, j);
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the array elements (both positive and negative integers):");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

  
        rearrange(arr);

 
        System.out.println("Rearranged array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
