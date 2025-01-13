class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];
        int []dp1=new int[n-1];
        int []dp2=new int[n-1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
            
        for (int i = 1; i < n ; i++) {
            arr1[i - 1] = nums[i];
        }
        for (int i = 0; i < n-1 ; i++) {
            arr2[i] = nums[i];
        }
        return Math.max(helper(n-2,arr1,n-1,dp1),helper(n-2,arr2,n-1,dp2));
    }

    // public int helper(int[] nums) {
        
    //     int n = nums.length;
    //     int prev = nums[0];
    //     int prev1 = 0;
    //     for (int i = 1; i < n; i++) {
    //         int take = nums[i];
    //         if (i > 1) {
    //             take += prev1;
    //         }
    //         int nottake = 0 + prev;
    //         int curr = Math.max(take, nottake);
    //         prev1 = prev;
    //         prev = curr;
    //     }
    //     return prev;
    // }
    static int helper(int i,int []nums,int n,int []dp){
        if(i==0) return nums[0];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+helper(i-2,nums,n,dp);   
        int nottake=0+helper(i-1,nums,n,dp);
        return dp[i]=Math.max(take,nottake); 
    }
}