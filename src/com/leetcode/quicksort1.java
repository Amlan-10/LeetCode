package com.leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class quicksort1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n; i++){
            a[i]=sc.nextInt();
        }
        QuickSort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
    public static void QuickSort(int[] a,int low,int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=a[m];
        while(s<=e){
          while(a[s] < pivot)
          {
              s++;
          }
            while(a[e] > pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
        }
        QuickSort(a,low,e);
        QuickSort(a,s,high);
    }
}
