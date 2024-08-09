class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
        
    static int helper(int [] nums,int goal){
        int n=nums.length;
        if(goal<0){
            return 0;
        }
        int cnt=0;
        int l=0,r=0,sum=0;
        while(r<n){
            sum+=nums[r];
            
            while(sum>goal){
                sum=sum-nums[l];
                l++;
            }
            if(sum<=goal){
                cnt=cnt+(r-l+1);
            }
            r++;
        }
        return cnt;
    }
}