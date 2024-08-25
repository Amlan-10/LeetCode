import java.util.Arrays;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        
        
        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = matrix[n - 1][j];
        }
        
        // Initialize the entire dp array by going row by row from the second last row towards the first row
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE;
                
                
                if (j > 0) {
                    a = matrix[i][j] + dp[i + 1][j - 1];
                }
                
               
                b = matrix[i][j] + dp[i + 1][j];
                
                
                if (j < n - 1) {
                    c = matrix[i][j] + dp[i + 1][j + 1];
                }
                
                
                dp[i][j] = Math.min(a, Math.min(b, c));
            }
        }
        
        // Find the minimum falling path sum from the first row
        int minFallingPathSum = Integer.MAX_VALUE;
        for (int j = n-1; j >= 0; j--) {
            minFallingPathSum = Math.min(minFallingPathSum, dp[0][j]);
        }
        
        return minFallingPathSum;
    }
}
