package com.leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class reversearr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        reverse(0,n-1,a);
    }
    static void reverse(int l,int r,int[]a){
        int temp=0;
        while(l<r)
        {
            temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(a));
    }
}
