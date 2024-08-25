class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        int n=og.length;
        int m=og[0].length;
        int [][]dp=new int[n][m];
        for(int []nums:dp){
            Arrays.fill(nums,-1);
        }
        return helper(n-1,m-1,og,dp);
    }
        
    static int helper(int i,int j,int [][]a,int [][]dp){
        if(i>=0 && j>=0 && a[i][j]==1) return 0;
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        int up=helper(i-1,j,a,dp);
        int left=helper(i,j-1,a,dp);
        return dp[i][j]=up+left;
    }
}