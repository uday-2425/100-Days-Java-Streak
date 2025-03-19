import java.util.*;

class ClosestString {

    static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        int d1 = -1, d2 = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals(word1))
                d1 = i;
            if (s.get(i).equals(word2))
                d2 = i;
            if (d1 != -1 && d2 != -1)
                ans = Math.min(ans, Math.abs(d1 - d2));
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        ArrayList<String> S = new ArrayList<>(Arrays.asList(sentence.split(" ")));

        System.out.print("Enter the first word: ");
        String word1 = sc.next();

        System.out.print("Enter the second word: ");
        String word2 = sc.next();

        int result = shortestDistance(S, word1, word2);
        
        if (result == Integer.MAX_VALUE) {
            System.out.println("One or both words not found in the sentence.");
        } else {
            System.out.println("Shortest distance between '" + word1 + "' and '" + word2 + "' is: " + result);
        }

        sc.close();
    }
}
