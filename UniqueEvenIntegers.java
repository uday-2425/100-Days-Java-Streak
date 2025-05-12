import java.util.*;

public class UniqueEvenIntegers {
    public static List<Integer> findEvenNumbers(int[] digits) {
        Set<Integer> result = new TreeSet<>();
        int n = digits.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    int d1 = digits[i];
                    int d2 = digits[j];
                    int d3 = digits[k];

                    if (d1 == 0) continue; // No leading zero
                    if (d3 % 2 != 0) continue; // Last digit must be even

                    int num = d1 * 100 + d2 * 10 + d3;
                    result.add(num);
                }
            }
        }

        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits separated by space: ");
        String[] input = sc.nextLine().split(" ");
        int[] digits = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            digits[i] = Integer.parseInt(input[i]);
        }

        List<Integer> output = findEvenNumbers(digits);
        System.out.println("Output: " + output);
    }
}
