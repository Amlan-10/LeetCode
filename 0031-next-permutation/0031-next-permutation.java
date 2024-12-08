class Solution {
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            ArrayList<Integer> ans=new ArrayList<>();
            for(int num:nums){
                ans.add(num);
            }
            Collections.reverse(ans);
            for(int i=0;i<n;i++){
                nums[i]=ans.get(i);
            }
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[ind]){
                    swap(nums,i,ind);
                    break;
                }
            }
            List<Integer> ans = new ArrayList<>();
            for (int num : nums) {
                ans.add(num);
            }
            List<Integer> sublist=ans.subList(ind+1,n);
            Collections.reverse(sublist);
            for(int i=0;i<n;i++){
                nums[i]=ans.get(i);
            }
        }
    }
}