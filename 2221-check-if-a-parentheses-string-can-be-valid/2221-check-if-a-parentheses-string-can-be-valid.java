class Solution {
    public boolean canBeValid(String s, String locked) {
        int n=s.length();
        if(n%2==1) return false;
        int balance=0,flexible=0;
        for(int i=0;i<n;i++){
            if(locked.charAt(i)=='0'){
                flexible++;
            }else if(s.charAt(i)=='('){
                balance++;
            }else{
                balance--;
            }
            if(balance<-flexible) return false;
        }
        balance=0;flexible=0;
        for(int i=n-1;i>=0;i--){
            if(locked.charAt(i)=='0'){
                flexible++;
            }else if(s.charAt(i)==')'){
                balance++;
            }else{
                balance--;
            }
            if(balance<-flexible) return false;
        }
        return true;
    }
}