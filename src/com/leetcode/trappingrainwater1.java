package com.leetcode;
import java.util.Scanner;
public class trappingrainwater1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println(trap(a));
    }
    public static int trap(int[] height) {
        int n = height.length;
        int []left = new int[n];
        int []right= new int[n];
        left[0]=height[0];
        int ans=0;
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<n;i++)
        {
            ans+=(Math.min(left[i],right[i])-height[i]);
        }
        return ans;
    }
}
