class Solution {
    public int numberOfSubarrays(int []nums,int goal){
        int  n=nums.length;
        return helper(nums,goal,n)-helper(nums,goal-1,n);
    }
    public int helper(int[] nums, int k,int n) {
        int l=0,r=0;
        int cnt=0,sum=0;
        if(k<0){
            return 0;
        }
        while(r<n){
           sum+=nums[r]%2;
           while(sum>k){
            sum-=nums[l]%2;
            l++;
           }
           if(sum<=k){
            cnt+=r-l+1;
           } 
           r++;
        }
        return cnt;
    }
}