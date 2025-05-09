import java.util.*;

public class BalancedPermutations {
    static final int MOD = 1_000_000_007;
    static Set<String> seen = new HashSet<>();

   
    static boolean isBalanced(String s) {
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (i % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        return evenSum == oddSum;
    }

   
    static void backtrack(char[] chars, boolean[] used, StringBuilder path, int[] count) {
        if (path.length() == chars.length) {
            String perm = path.toString();
            if (!seen.contains(perm) && isBalanced(perm)) {
                count[0]++;
                seen.add(perm);
            }
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]))
                continue;

            used[i] = true;
            path.append(chars[i]);
            backtrack(chars, used, path, count);
            path.deleteCharAt(path.length() - 1);
            used[i] = false;
        }
    }

    public static int countBalancedPermutations(String velunexorai) {
        char[] chars = velunexorai.toCharArray();
        Arrays.sort(chars);  
        boolean[] used = new boolean[chars.length];
        int[] count = new int[1];  
        seen.clear();
        backtrack(chars, used, new StringBuilder(), count);
        return count[0] % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        String velunexorai = sc.next();
        int result = countBalancedPermutations(velunexorai);
        System.out.println("Output: " + result);
    }
}
