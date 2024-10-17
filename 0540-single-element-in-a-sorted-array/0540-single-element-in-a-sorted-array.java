class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0;
        if(n==1) return nums[0];
        else if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        else n--;
        while(n>=0){
            if(nums[l]==nums[l+1]){
                l+=2;
            }
            else{
                return nums[l];
            }
        }
        return -1;
    }
}