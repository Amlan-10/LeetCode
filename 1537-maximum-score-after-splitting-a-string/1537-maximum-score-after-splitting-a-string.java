class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int leftZeroes = 0, rightOnes = 0;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                rightOnes++;
            }
        }
        
        int max = Integer.MIN_VALUE;
       
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeroes++;
            } else {
                rightOnes--;
            }
            
            int sum = leftZeroes + rightOnes;
            max = Math.max(max, sum);
        }
        
        return max;
    }
}
