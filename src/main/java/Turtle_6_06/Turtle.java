package Turtle_6_06;

public class Turtle {
    public static void main(String[] args) {
        int[][] grid = {{4, 3, 1}, {1, 5, 1}, {4, 2, 1}};

        int minSum = minPathSum(grid);
        System.out.println("Минимальная сумма:" + minSum);
    }

    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;

        int[][] dp = new int[rows][cols];
        dp[0][0] = grid[0][0];
        for(int i = 1; i < cols; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < rows; i++) {
            for(int j = 1; j < cols; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }

        }

        return dp[rows - 1][cols - 1];




    }
}
