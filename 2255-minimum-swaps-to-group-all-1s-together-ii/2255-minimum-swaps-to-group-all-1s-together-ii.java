class Solution {
    static int countZeroes(int []a,int i,int j){
        int cnt=0;
        for(int k=i;k<=j;k++){
            if(a[i]==0){
                cnt++;
            }
        }
        return cnt;
    }
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int no_of_ones=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                no_of_ones++;
            }
        }
        int l=0,window_ones=0,max_ones=0;
        for(int r=0;r<2*n;r++){
            if(nums[r%n]==1){
                window_ones++;
            }
            if(r-l+1>no_of_ones){
                window_ones-=nums[l%n];
                l++;
            }
            max_ones=Math.max(max_ones,window_ones);
        }
        return no_of_ones-max_ones;
    }
}