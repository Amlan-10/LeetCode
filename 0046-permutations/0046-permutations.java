class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        boolean [] f=new boolean[n];
        helper(n,nums,f,ans,new ArrayList<>());
        return ans;
    }
    static void helper(int n,int[] nums,boolean[]f,List<List<Integer>> ans, List<Integer> ds) {
       if(ds.size()==n){
        ans.add(new ArrayList<>(ds));
        return;
       }
       for(int i=0;i<n;i++){
        if(!f[i]){
            f[i]=true;
            ds.add(nums[i]);
            helper(n,nums,f,ans,ds);
            ds.remove(ds.size()-1);
            f[i]=false;
        }
       }
    }
}