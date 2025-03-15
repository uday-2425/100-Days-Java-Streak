import java.util.Scanner;

class NonRepeatingChar{
  
    static char NonRepeatingChar(String s) {
        int n = s.length();

        for (int i = 0; i < n; ++i) {
            boolean found = false;

            for (int j = 0; j < n; ++j) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) 
                return s.charAt(i);
        }

        return '$';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char result = NonRepeatingChar(s);

        if (result == '$') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }

        sc.close();
    }
}
