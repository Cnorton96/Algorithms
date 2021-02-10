package random;

import java.util.PriorityQueue;

public class minPath {
    public int maxPathScore(int[][] matrix) {
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[][] visited = new boolean[n][m];

        // in the BFS approach, for each step, we are interested in getting the maximum min that we have seen so far, thus we reverse the ordering in the pq
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);

        pq.offer(new int[]{0, 0, matrix[0][0]});

        // BFS
        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            int row = cell[0];
            int col = cell[1];

            if (row == n - 1 && col == m - 1) {
                return cell[2];
            }

            visited[row][col] = true;

            for (int[] dir : directions) {
                int nextRow = row + dir[0];
                int nextCol = col + dir[1];

                if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m || visited[nextRow][nextCol]) continue;

                // we are keeping track of the min element that we have seen until now
                pq.offer(new int[]{nextRow, nextCol, Math.min(cell[2], matrix[nextRow][nextCol])});
            }
        }
        return -1;
    }
}
