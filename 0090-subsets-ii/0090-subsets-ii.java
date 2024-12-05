class Solution {
    static void subset(int idx,int[]a,List<Integer> ds,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for (int j = idx; j < a.length; j++) {
            if(j>idx && a[j]==a[j-1]){
                continue;
            }
                ds.add(a[j]);
                subset(j + 1, a,ds,ans);
                ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // Arrays.sort(nums);
        subset(0,nums, new ArrayList<>(),ans);
        return ans;
    }
}