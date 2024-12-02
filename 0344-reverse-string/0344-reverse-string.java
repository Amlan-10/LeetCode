class Solution {
    private void swap(char []s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<n/2;i++){
            swap(s,i,n-i-1);
        }
    }
}