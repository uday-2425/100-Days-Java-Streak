import java.util.Scanner;

class Modifystring {

    static void modifyString(String s, String s1, String s2) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            int k = 0;

            if (s.charAt(i) == s1.charAt(k) && i + s1.length() <= s.length()) {
                int j;
                for (j = i; j < i + s1.length(); j++) {
                    if (s.charAt(j) != s1.charAt(k)) {
                        break;
                    } else {
                        k++;
                    }
                }

                if (j == i + s1.length()) {
                    ans += s2;
                    i = j - 1;
                } else {
                    ans += s.charAt(i);
                }
            } else {
                ans += s.charAt(i);
            }
        }

        System.out.println("Modified String: " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String S = sc.nextLine();

        System.out.print("Enter the substring to replace: ");
        String S1 = sc.nextLine();

        System.out.print("Enter the replacement substring: ");
        String S2 = sc.nextLine();

        modifyString(S, S1, S2);

        sc.close();
    }
}
