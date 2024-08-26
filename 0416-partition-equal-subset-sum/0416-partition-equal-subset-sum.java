
class Solution {
    public boolean canPartition(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        int target = 0;
        for (int num : nums) {
            target += num;
        }
        
        if (target % 2 != 0) {
            return false;
        }
        
        target /= 2; 
        
        
        int[][] dp = new int[nums.length ][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return helper(nums.length - 1, target, nums, dp);
    }

    private boolean helper(int ind, int target, int[] nums, int[][] dp) {
        if (target == 0) {
            return true;
        }
        
        if (ind ==0) {
            return nums[0]==target;
        }
        
        if (dp[ind][target] != -1) {
            return dp[ind][target] == 1;
        }
        
        boolean notPick = helper(ind - 1, target, nums, dp);
        boolean pick = false;
        
        if (target >= nums[ind]) {
            pick = helper(ind - 1, target - nums[ind], nums, dp);
        }
        
        dp[ind][target] = (pick || notPick) ? 1 : 0;
        return dp[ind][target] == 1;
    }
}