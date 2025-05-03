public class DominoRotations {

    public static int minDominoRotations(int[] tops, int[] bottoms) {
        int rotations = check(tops[0], tops, bottoms);
        if (rotations != -1 || tops[0] == bottoms[0]) return rotations;
        else return check(bottoms[0], tops, bottoms);
    }

    private static int check(int target, int[] tops, int[] bottoms) {
        int rotationsTop = 0;
        int rotationsBottom = 0;

        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) {
                return -1;
            } else if (tops[i] != target) {
                rotationsTop++;
            } else if (bottoms[i] != target) {
                rotationsBottom++;
            }
        }
        return Math.min(rotationsTop, rotationsBottom);
    }

    public static void main(String[] args) {
        int[] tops1 = {2, 1, 2, 4, 2, 2};
        int[] bottoms1 = {5, 2, 6, 2, 3, 2};
        System.out.println(minDominoRotations(tops1, bottoms1));

        int[] tops2 = {3, 5, 1, 2, 3};
        int[] bottoms2 = {3, 6, 3, 3, 4};
        System.out.println(minDominoRotations(tops2, bottoms2));
    }
}
