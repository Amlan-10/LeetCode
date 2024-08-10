class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        
        int sind=-1,min=Integer.MAX_VALUE,cnt=0;
        int hash[]=new int[256];
        
        for(int i=0;i<m;i++){
            hash[t.charAt(i)]++;
        }
        int l=0,r=0;
        while(r<n){
            if(hash[s.charAt(r)]>0) cnt++;
            hash[s.charAt(r)]--;
            while(cnt==m){
                if(r-l+1<min){
                    min=r-l+1;
                    sind=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0) cnt--;
                l++;
            }
            r++;
        }
        return sind == -1? "":s.substring(sind,sind+min);
    }
}