class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int l=0,r=0,maxlen=Integer.MIN_VALUE,zeroes=0;
        while(r<n){
            if(nums[r]==0){
                zeroes++;
            }
            while(zeroes>k){
                if(nums[l]==0) zeroes--;
                l++;
            }
            if(zeroes<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}