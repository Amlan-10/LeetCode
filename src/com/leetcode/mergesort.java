package com.leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class mergesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n; i++){
            a[i]=sc.nextInt();
        }
        MergeSort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
    public static void MergeSort(int[]a,int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            MergeSort(a,l,mid);
            MergeSort(a,mid+1,r);
            Merge(a,l,mid,r);
        }
    }
    public static void Merge(int []a,int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=l;
        int[]b=new int[a.length];
        while(i<=mid && j<=r){
            if(a[i]<a[j]){
                b[k]=a[i++];
            }else{
                b[k]=a[j++];
            }
            k++;
        }
        if(i>mid){
            while(j<=r){
                b[k]=a[j];
                k++;j++;
            }
        }
        else{
            while(i<=mid){
                b[k]=a[i];
                k++;i++;
            }
        }
        for(k=l;k<=r;k++) {
            a[k] = b[k];
        }
    }
}