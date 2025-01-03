class Solution {
    static int countZero(String s){
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                cnt++;
            }
        }
        return cnt;
    }
    static int countOnes(String s){
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
    public int maxScore(String s) {
        int n = s.length();
        String l = "";
        String r = "";
        int max = Integer.MIN_VALUE;
        int zeroes = 0, ones = 0, sum = 0;
        for (int i = 0; i < n-1; i++) {
            l = s.substring(0, i + 1);
            r = s.substring(i + 1, n);
            zeroes = countZero(l);
            ones = countOnes(r);
            sum=zeroes+ones;
            max=Math.max(max,sum);
        }
        return max;
    }
}