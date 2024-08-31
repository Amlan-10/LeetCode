class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int [][][] dp=new int[n][2][3];
        for(int [][]nums:dp){
            for(int []x:nums){
                Arrays.fill(x,-1);
            }
        }
        return helper(prices,0,1,2,dp);
    }
    static int helper(int []prices,int i,int buy,int j,int [][][]dp){
        int n=prices.length;
        if(j==0 || i==n) return 0;
        if(dp[i][buy][j]!=-1) return dp[i][buy][j];
        if(buy==1){
            return dp[i][buy][j]=Math.max(-prices[i]+
            helper(prices,i+1,0,j,dp),0+helper(prices,i+1,1,j,dp));
        }else{
            return dp[i][buy][j]=Math.max(prices[i]+
            helper(prices,i+1,1,j-1,dp),0+helper(prices,i+1,0,j,dp));
        }
    }
}