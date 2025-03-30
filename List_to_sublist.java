

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_to_sublist {


    public static List[] split(List<String> list) {
       
        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();

       
        int size = list.size();

     
        for (int i = 0; i < size / 2; i++)
            first.add(list.get(i));

        for (int i = size / 2; i < size; i++)
            second.add(list.get(i));

   
        return new List[]{first, second};
    }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        List<String> list = new ArrayList<>();

      
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

      
        List[] lists = split(list);

  
        System.out.println("First sublist: " + lists[0]);
        System.out.println("Second sublist: " + lists[1]);

        sc.close();
    }
}
