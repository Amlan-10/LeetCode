class Solution {
    static void helper(int open,int close,List<String> ds,StringBuilder st){
        if(open==0 && close==0){
            ds.add(st.toString());
            return;
        }
        if(open>0){
            st.append("(");
            helper(open-1,close,ds,st);
            st.deleteCharAt(st.length()-1);
        }
        if(close>0){
            if(open<close){
                st.append(")");
                helper(open,close-1,ds,st);
                st.deleteCharAt(st.length()-1);
            }
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        StringBuilder st=new StringBuilder();
        helper(n,n,l,st);
        return l;
    }
}