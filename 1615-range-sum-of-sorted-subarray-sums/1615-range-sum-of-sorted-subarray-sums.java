class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int m = 1000000007;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=(sum+nums[j])%m;
                arr.add(sum);
            }
        }
        Collections.sort(arr);
        int total_sum=0;
        for(int i=left-1;i<right;i++){
            total_sum=(total_sum+arr.get(i))%m;
        }
        return total_sum%m;
    }
}