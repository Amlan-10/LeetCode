class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int []dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=helper(amount,coins,dp);
        return ans==Integer.MAX_VALUE/2?-1:ans;
    }
    static int helper(int amount,int []coins,int []dp){
        if(amount==0) return 0;
        if(dp[amount]!=-1) return dp[amount];
        int ans=Integer.MAX_VALUE/2;
        for(int coin:coins){
            if(amount-coin>=0){
                ans=Math.min(ans,helper(amount-coin,coins,dp)+1);
            }
        }
        return dp[amount]=ans;
    }
}