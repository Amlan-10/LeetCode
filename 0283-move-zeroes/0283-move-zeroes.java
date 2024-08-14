class Solution {
    public void swap(int []nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int l=0;
        for(int r=0;r<n;r++){
            if(nums[r]!=0){
                swap(nums,l,r);
                l++;
            }
        }
    }
}