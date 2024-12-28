class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int ans=helper(root);
        return ans!=-1;
    }

    public int helper(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh=helper(root.left);
        int rh=helper(root.right);
        if(lh==-1 || rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return 1+Math.max(lh,rh);
    }
}