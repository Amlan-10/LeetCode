class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,helper(i,nums,dp));
        }
        return ans;
    }
    static int helper(int i,int []a,int []dp){
        int ans=1;
        if(dp[i]!=-1) return dp[i];
        for(int j=0;j<i;j++){
            if(a[i]>a[j]){
                ans=Math.max(ans,helper(j,a,dp)+1);
            }
        }
        return dp[i]=ans;
    }
}