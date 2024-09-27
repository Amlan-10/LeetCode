class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int i=n-1;
        StringBuilder st=new StringBuilder();
        while(i>=0){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.append(Character.toLowerCase(c));
            }
            i--;
        }
        int l=0,r=st.length()-1;
        while(l<=r){
            if(st.charAt(l)==st.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}