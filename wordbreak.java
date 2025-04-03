import java.util.*;

public class wordbreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; 

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter the number of words in the dictionary: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> wordDict = new ArrayList<>();
        System.out.println("Enter dictionary words:");
        for (int i = 0; i < n; i++) {
            wordDict.add(sc.nextLine());
        }

       
        if (wordBreak(s, wordDict)) {
            System.out.println("Yes, the string can be segmented into dictionary words.");
        } else {
            System.out.println("No, the string cannot be segmented.");
        }

        sc.close();
    }
}
