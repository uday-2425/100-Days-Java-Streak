import java.util.ArrayList;
import java.util.Scanner;

class LeadersInArray {

   
    static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n - 1];  
        
       
        result.add(maxFromRight);

       
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];  
                result.add(0, arr[i]); 
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = leaders(arr);

  
        System.out.println("Leaders in the array: " + result);
        
        sc.close();
    }
}
