import java.util.*;

public class GenerateEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter space-separated digits: ");
        String[] input = sc.nextLine().split(" ");
        int[] digits = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            digits[i] = Integer.parseInt(input[i]);
        }

        List<Integer> result = findValidEvenNumbers(digits);
        System.out.println("Valid even numbers: " + result);
    }

    public static List<Integer> findValidEvenNumbers(int[] digits) {
        Set<Integer> resultSet = new TreeSet<>();

        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    int d1 = digits[i], d2 = digits[j], d3 = digits[k];

                    if (d1 == 0) continue; 
                    if (d3 % 2 != 0) continue; 

                    int num = d1 * 100 + d2 * 10 + d3;
                    resultSet.add(num);
                }
            }
        }

        return new ArrayList<>(resultSet);
    }
}
