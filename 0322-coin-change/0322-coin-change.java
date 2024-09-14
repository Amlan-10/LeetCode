class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int [][] dp=new int[n+1][amount+1];
        for(int [] num:dp){
            Arrays.fill(num,-1);
        }
       int ans=helper(coins,n-1,amount,dp);
       if(ans>=(int) Math.pow(10, 9)){
        return -1;
       }
       return ans;
    }
    static int helper(int []a,int ind,int tar,int [][]dp){
        if(ind==0){
            if(tar%a[ind]==0){
                return tar/a[ind];
            }else{
                return (int) Math.pow(10, 9);
            }
        }
        if(dp[ind][tar]!=-1){
            return dp[ind][tar];
        }
        int nottaken=helper(a,ind-1,tar,dp);
        int taken=(int) Math.pow(10, 9);
        if(a[ind]<=tar){
            taken=1+helper(a,ind,tar-a[ind],dp);
        }
        return dp[ind][tar]=Math.min(taken,nottaken);
    }
}