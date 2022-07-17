package com.leetcode;
import java.util.Arrays;
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
    }
    public static void swap(int[] a,int i,int j){
        int temp=0;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int partition(int[]a,int low,int high){
        int pivot=a[low];
        int i=low;
        int j=high;
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
        System.out.println(Arrays.toString(a));
    }
}
