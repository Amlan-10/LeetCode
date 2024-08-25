class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int[] nums : dp) {
            Arrays.fill(nums, -1);
        }
        return helper(n - 1, m - 1, grid, dp);
    }

    static int helper(int i, int j, int[][] a, int[][] dp) {
        if (i == 0 && j == 0)
            return a[i][j];
        if (i < 0 || j < 0)
            return (int) Math.pow(10, 9);
        if (dp[i][j] != -1)
            return dp[i][j];
        int up = a[i][j] + helper(i - 1, j, a, dp);
        int left = a[i][j] + helper(i, j - 1, a, dp);
        return dp[i][j] = Math.min(up, left);
    }
}