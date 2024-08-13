class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> a=new ArrayList<>();
        combinations(1,k,n,a,new LinkedList());
        return a;
    }
    private void combinations(int start,int k,int n,List<List<Integer>> res,LinkedList ll){
        if(n<0 || k<0){
            return;
        }
        if(n==0 && k==0){
            res.add(new ArrayList<>(ll));
            return;
        }
        for(int i=start;i<=9;i++){
            ll.add(i);
            combinations(i+1,k-1,n-i,res,ll);
            ll.removeLast();
        }
    }
}