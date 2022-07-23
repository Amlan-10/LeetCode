package com.leetcode;
import java.util.Scanner;
import java.util.Arrays;
public class infinitesarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the key:");
        int key=sc.nextInt();
        System.out.println(Infinite(a,key));
    }
    public static int Binary(int[] a,int key,int l,int r){
//         l=0; r=a.length-1;
        Arrays.sort(a);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]<key){
                l=mid+1;
            }
            else if(a[mid]>key){
                r=mid-1;
            }
        }
        return -1;
    }
    public static int Infinite(int []a,int key){
        int low=0;
        int high=1;
        if(a[high]<key){
            low=high;
            high=high*2;
        }
        return Binary(a,key,low,high);
    }
}
