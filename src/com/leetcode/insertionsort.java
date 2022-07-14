package com.leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n; i++){
            a[i]=sc.nextInt();
        }
        insertionSort(a,n);
    }
    public static void insertionSort(int[]a,int n){
        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
