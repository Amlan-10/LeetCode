class Solution {
    public String reverse(String s,int n){
        StringBuilder sb=new StringBuilder(s);
        int start=0,end=n-1;
        while(start<=end){
            char t=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,t);
            start++;
            end--;
        }
        return sb.toString();
    }
    public String reverseWords(String s) {
        String [] words=s.split(" ");
        int n=words.length;
        for(int i=0;i<n;i++){
            words[i]=reverse(words[i],words[i].length());
        }
        return String.join(" ",words);
    }
}