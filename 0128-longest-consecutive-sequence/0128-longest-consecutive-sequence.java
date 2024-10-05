class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(!st.contains(nums[i]-1)){
                int currNum=nums[i];
                int currStreak=1;
                while(st.contains(currNum+1)){
                    currNum++;
                    currStreak++;
                }
                max=Math.max(max,currStreak);
            }
        }
        return max;
    }
}