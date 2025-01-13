class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1; // Initialize all elements to -1
        }
        return climb(n, dp);
    }
    
    private int climb(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return 1; // Base cases corrected
        }
        if (n == 2) {
            return 2; // Base case corrected
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = climb(n - 1, dp) + climb(n - 2, dp);
        return dp[n];
    }
}
