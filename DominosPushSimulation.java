import java.util.Scanner;

public class DominosPushSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dominoes: ");
        String dominoes = scanner.nextLine();
        scanner.close();

        String result = pushDominoes(dominoes);
        System.out.println("Final State: " + result);
    }

    public static String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] forces = new int[n];

        // Apply forces from left to right
        int force = 0;
        for (int i = 0; i < n; i++) {
            if (dominoes.charAt(i) == 'R') {
                force = n;
            } else if (dominoes.charAt(i) == 'L') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] += force;
        }

        // Apply forces from right to left
        force = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L') {
                force = n;
            } else if (dominoes.charAt(i) == 'R') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] -= force;
        }

        // Construct the result
        StringBuilder result = new StringBuilder();
        for (int f : forces) {
            if (f > 0) {
                result.append('R');
            } else if (f < 0) {
                result.append('L');
            } else {
                result.append('.');
            }
        }

        return result.toString();
    }
}
