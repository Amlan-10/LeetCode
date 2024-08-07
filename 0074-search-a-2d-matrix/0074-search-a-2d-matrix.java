class Solution {
     static boolean binarySearch(int[] nums, int target) {
        int n = nums.length; 
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) 
            {
                return true;
            }
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
       int n=matrix.length;
       int m=matrix[0].length;
       for(int i=0;i<n;i++){
        if(target>=matrix[i][0] && target<=matrix[i][m-1]){
            return binarySearch(matrix[i],target);
        }
       }
       return false;
    }
}