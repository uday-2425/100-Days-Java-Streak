import java.util.Scanner;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n <= 0) return "";
        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char prevChar = result.charAt(0);

            for (int j = 1; j < result.length(); j++) {
                char currentChar = result.charAt(j);
                if (currentChar == prevChar) {
                    count++;
                } else {
                    sb.append(count).append(prevChar);
                    count = 1;
                    prevChar = currentChar;
                }
            }

            sb.append(count).append(prevChar); // Append last group
            result = sb.toString();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        String result = countAndSay(n);
        System.out.println("Count and Say term " + n + ": " + result);
    }
}
