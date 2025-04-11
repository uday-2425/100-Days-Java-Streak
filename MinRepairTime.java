import java.util.*;

public class MinRepairTime {

    public static boolean canRepairAllCars(int[] ranks, int cars, long maxTime) {
        long total = 0;
        for (int r : ranks) {
            total += (long)Math.sqrt(maxTime / r);
            if (total >= cars) return true;
        }
        return total >= cars;
    }

    public static long minimumTime(int[] ranks, int cars) {
        long left = 1;
        long right = (long) Arrays.stream(ranks).min().getAsInt() * (long) cars * cars;

        while (left < right) {
            long mid = (left + right) / 2;
            if (canRepairAllCars(ranks, cars, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] ranks = {4, 2, 3, 1};
        int cars = 10;
        long result = minimumTime(ranks, cars);
        System.out.println("Minimum time to repair all cars: " + result);
    }
}
