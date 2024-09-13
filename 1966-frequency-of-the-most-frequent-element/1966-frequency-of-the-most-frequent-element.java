class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=0;
        int l=0;
        long cursum=0;
        for(int r=0;r<n;r++){
            long target=nums[r];
            cursum+=nums[r];
            if((r-l+1)*target-cursum>k){
                cursum-=nums[l];
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return (int)res;
    }
}