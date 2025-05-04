import java.util.*;

public class DominoPair {
    public static int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;

        for (int[] domino : dominoes) {
            
            int a = Math.min(domino[0], domino[1]);
            int b = Math.max(domino[0], domino[1]);
            String key = a + "," + b;

            
            count += map.getOrDefault(key, 0);

            
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] dominoes1 = {{1,2}, {2,1}, {3,4}, {5,6}};
        int[][] dominoes2 = {{1,2}, {1,2}, {1,1}, {1,2}, {2,2}};

        System.out.println("Output 1: " + numEquivDominoPairs(dominoes1)); 
        System.out.println("Output 2: " + numEquivDominoPairs(dominoes2)); 
    }
}
