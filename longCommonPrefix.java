import java.util.Arrays;
import java.util.Scanner;

class longCommonPrefix {
  
    static String longestCommonPrefix(String[] arr) {
        if (arr.length == 0) return "";

        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];
        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("Longest Common Prefix: " + longestCommonPrefix(arr));

        sc.close();
    }
}
