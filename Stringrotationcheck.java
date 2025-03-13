import java.util.Scanner;

class Stringrotationcheck {
    
   
    static boolean areRotations(String s1, String s2) {
        int n = s1.length();

       
        if (n != s2.length()) {
            return false;
        }

      
        for (int i = 0; i < n; ++i) {
          
            if (s1.equals(s2)) {
                return true;
            }

       
            char last = s1.charAt(s1.length() - 1);
            s1 = last + s1.substring(0, s1.length() - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if(areRotations(s1,s2)){
            System.out.println("Strings are rotations of each other");

        }else{
            System.out.println("Strings are not rotations of each other");
        }
        

        sc.close();
    }
}
