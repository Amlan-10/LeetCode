class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;i++){
            x=x^nums[i];
        }
        return x;
    }
}