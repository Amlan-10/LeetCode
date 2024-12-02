class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] s=sentence.split(" ");
        int n=s.length;
        for(int i=0;i<n;i++){
            if(s[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}