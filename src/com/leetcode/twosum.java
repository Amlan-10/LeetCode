package com.leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            Integer requiredNum = (Integer)(target - nums[i]);
            if(indexMap.containsKey(requiredNum)){
                int[]toReturn = {indexMap.get(requiredNum), i};
                return toReturn;
            }
            indexMap.put(nums[i], i);
        }
        return null;
    }
}