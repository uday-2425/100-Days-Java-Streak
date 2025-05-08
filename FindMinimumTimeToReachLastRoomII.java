import java.util.*;

public class FindMinimumTimeToReachLastRoomII {

    static class State {
        int row, col, time, parity;

        public State(int row, int col, int time, int parity) {
            this.row = row;
            this.col = col;
            this.time = time;
            this.parity = parity; // 0 for 1s move, 1 for 2s move
        }
    }

    public static int minimumTime(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;

        int[][][] dist = new int[n][m][2];
        for (int[][] layer : dist)
            for (int[] row : layer)
                Arrays.fill(row, Integer.MAX_VALUE);

        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.time));
        pq.offer(new State(0, 0, 0, 0));
        dist[0][0][0] = 0;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while (!pq.isEmpty()) {
            State curr = pq.poll();
            if (curr.time > dist[curr.row][curr.col][curr.parity]) continue;

            for (int[] d : directions) {
                int nr = curr.row + d[0];
                int nc = curr.col + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    int moveTimeRequired = curr.parity == 0 ? 1 : 2;
                    int waitTime = Math.max(curr.time, moveTime[nr][nc]);
                    int nextTime = waitTime + moveTimeRequired;
                    int nextParity = 1 - curr.parity;

                    if (nextTime < dist[nr][nc][nextParity]) {
                        dist[nr][nc][nextParity] = nextTime;
                        pq.offer(new State(nr, nc, nextTime, nextParity));
                    }
                }
            }
        }

        return Math.min(dist[n - 1][m - 1][0], dist[n - 1][m - 1][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] moveTime = new int[n][m];
        System.out.println("Enter the moveTime grid values row-wise:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                moveTime[i][j] = sc.nextInt();

        int result = minimumTime(moveTime);
        System.out.println("Minimum time to reach the last room: " + result);
    }
}
