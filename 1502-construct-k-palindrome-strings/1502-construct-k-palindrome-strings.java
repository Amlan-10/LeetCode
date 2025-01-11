class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();
        if(n<k) return false;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int cnt=0;
        for(Map.Entry<Character,Integer> m:mp.entrySet()){
            if(m.getValue()%2==1){
                cnt++;
            }
        }
        return cnt<=k;
    }
}