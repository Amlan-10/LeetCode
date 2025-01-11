class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int []maxCharFreq=new int[26];
        int []freq=new int[26];
        for(String words:words2){
            Arrays.fill(freq,0);      
            for(Character ch:words.toCharArray()){
                freq[ch-'a']++;
            }
            for (int i = 0; i < 26; ++i) {
                maxCharFreq[i] = Math.max(maxCharFreq[i], freq[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(String words:words1){
            Arrays.fill(freq,0);      
            for(Character ch:words.toCharArray()){
                freq[ch-'a']++;
            }
            boolean isUniversal=true;
            for(int i=0;i<26;i++){
                if(maxCharFreq[i]>freq[i]){
                    isUniversal=false;
                    break;
                }
            }
            if(isUniversal){
                ans.add(words);
            }
        }
        return ans;
    }
}