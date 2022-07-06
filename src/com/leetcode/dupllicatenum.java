package com.leetcode;
import java.util.*;
import java.util.Arrays;
public class dupllicatenum {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        x= sc.nextInt();;
        int[] n=new int[x];
        for(int i=0;i<x;i++)
            n[i]=sc.nextInt();
        Arrays.sort(n);
        System.out.println(containsDuplicate(n));
    }

}
