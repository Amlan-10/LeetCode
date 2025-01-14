class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,lis(i,nums,dp));
        }
        return max;
    }
    public static int lis(int i,int []nums,int []dp){
        int ans=1;
        if(dp[i]!=-1) return dp[i];
        for(int j=0;j<i;j++){
            if(nums[i]>nums[j]){
                ans=Math.max(ans,lis(j,nums,dp)+1);
            }
        }
        return dp[i]=ans;
    }
}