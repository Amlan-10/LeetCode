package com.leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n; i++){
            a[i]=sc.nextInt();
        }
        bubbleSort(a,n);
    }
    public static void bubbleSort(int arr[], int n)
    {
        boolean swapped=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    swap(arr,j+1,j);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] a,int i,int j){
        int temp=0;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
