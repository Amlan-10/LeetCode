class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return helper(n-1,nums,n,dp);
    }
    static int helper(int i,int []nums,int n,int []dp){
        if(i==0) return nums[0];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+helper(i-2,nums,n,dp);   
        int nottake=0+helper(i-1,nums,n,dp);
        return dp[i]=Math.max(take,nottake); 
    }
}