package com.leetcode;
import java.util.Arrays; //O(nlog)(best-case)(time complexity)  O(n^2)(worst-case)
import java.util.Scanner;
public class quicksort {
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
    public static void swap(int[] a,int i,int j){
        int temp=0;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int partition(int[]a,int low,int high){
        int i=low;
        int j=high;
        int pivot=a[low];
        while(i<j){
            while(i<=high-1 && a[i]<=pivot){
                i++;
            }while(a[j]>pivot && j>=low){
                j--;
            }
            if(i<j){
                swap(a,i,j);
            }
        }
        swap(a,j,low);
        return j;
    }
    public static void QuickSort(int[]a,int low,int high){
        if(low<high){
            int pivot=partition(a,low,high);
            QuickSort(a,low,pivot-1);
            QuickSort(a,pivot+1,high);
        }

    }
}
