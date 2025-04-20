import java.util.*;

public class MinimumRabbits {

    public static int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int totalRabbits = 0;

        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int groupSize = entry.getKey() + 1;
            int count = entry.getValue();
            int numberOfGroups = (int) Math.ceil((double) count / groupSize);
            totalRabbits += numberOfGroups * groupSize;
        }

        return totalRabbits;
    }

    public static void main(String[] args) {
        int[] answers1 = {1, 1, 2};
        int[] answers2 = {10, 10, 10};

        System.out.println("Minimum rabbits (Test Case 1): " + numRabbits(answers1)); // Output: 5
        System.out.println("Minimum rabbits (Test Case 2): " + numRabbits(answers2)); // Output: 11
    }
}
