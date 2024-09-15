class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st=new Stack<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>0 && a[i]<0){
                if(st.peek()+a[i]==0){
                    st.pop();
                    a[i]=0;
                }
                else if(st.peek()+a[i]<0){
                    st.pop();
                }
                else{
                    a[i]=0;
                }
            }
            if(a[i]!=0){
                st.push(a[i]);
            }
        }
        int []ans=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}