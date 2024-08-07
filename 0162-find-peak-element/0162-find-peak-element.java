class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int l=1,r=n-2;
        if(n==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid+1]>nums[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
}