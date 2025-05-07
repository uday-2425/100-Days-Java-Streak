import java.util.*;

public class MinimumTimeToReachLastRoom {

    static class Cell {
        int row, col, time;

        Cell(int r, int c, int t) {
            row = r;
            col = c;
            time = t;
        }
    }

    public static int minTimeToReachEnd(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] visited = new boolean[n][m];

        PriorityQueue<Cell> pq = new PriorityQueue<>(Comparator.comparingInt(cell -> cell.time));
        pq.offer(new Cell(0, 0, 0));

        while (!pq.isEmpty()) {
            Cell curr = pq.poll();

            if (visited[curr.row][curr.col]) continue;
            visited[curr.row][curr.col] = true;

            if (curr.row == n - 1 && curr.col == m - 1) {
                return curr.time;
            }

            for (int[] dir : directions) {
                int newRow = curr.row + dir[0];
                int newCol = curr.col + dir[1];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && !visited[newRow][newCol]) {
                    int nextTime = curr.time + 1;
                    int availableTime = moveTime[newRow][newCol];

                    if (nextTime < availableTime) {
                        nextTime = availableTime;
                    }

                    // Adjust parity if needed
                    if ((nextTime % 2) != (availableTime % 2)) {
                        nextTime++;
                    }

                    pq.offer(new Cell(newRow, newCol, nextTime));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (n): ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns (m): ");
        int m = sc.nextInt();

        int[][] moveTime = new int[n][m];
        System.out.println("Enter the moveTime grid values row-wise:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                moveTime[i][j] = sc.nextInt();
            }
        }

        int result = minTimeToReachEnd(moveTime);
        System.out.println("Minimum time to reach last room: " + result);
    }
}
