class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int totalBeauty = 0;
        
        for (int i = 0; i < n; i++) {
            int[] hash = new int[26];
            for (int j = i; j < n; j++) {
                hash[s.charAt(j) - 'a']++;
                int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (hash[k] > 0) {
                        max = Math.max(max, hash[k]);
                        min = Math.min(min, hash[k]);
                    }
                }
                totalBeauty += max - min;
            }
        }
        
        return totalBeauty;
    }
}
