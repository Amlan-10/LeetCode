class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int curval=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            curval+=nums[i];
            if(curval>max){
                max=curval;
            }
            if(curval<0){
                curval=0;
            }
        }
        return max;
    }
}