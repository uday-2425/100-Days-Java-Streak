import java.util.*;

public class HiddenSequenceRange {
    public static int numberOfValidSequences(int[] differences, int lower, int upper) {
        int n = differences.length;
        long min = 0, max = 0, current = 0;

        for (int diff : differences) {
            current += diff;
            min = Math.min(min, current);
            max = Math.max(max, current);
        }

        long possibleStarts = (long) upper - lower - (max - min) + 1;
        return (int) Math.max(0, possibleStarts);
    }

    public static void main(String[] args) {
        // Example 1
        int[] differences1 = {1, -3, 4};
        int lower1 = 1;
        int upper1 = 6;
        System.out.println("Output: " + numberOfValidSequences(differences1, lower1, upper1));  // Output: 2

        // Example 2
        int[] differences2 = {3, -4, 5, 1, -2};
        int lower2 = -4;
        int upper2 = 5;
        System.out.println("Output: " + numberOfValidSequences(differences2, lower2, upper2));  // Output: 4

        // Example 3
        int[] differences3 = {4, -7, 2};
        int lower3 = 3;
        int upper3 = 6;
        System.out.println("Output: " + numberOfValidSequences(differences3, lower3, upper3));  // Output: 0
    }
}
