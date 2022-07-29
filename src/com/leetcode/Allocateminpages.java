package com.leetcode;
import java.util.Scanner;
public class Allocateminpages {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number of students: ");
        k=sc.nextInt();
        System.out.println(minPages(a,k));
    }
    public static int minPages(int[] a,int k){
        int min=maxof(a);
        int max=sumof(a);
        int res=0;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(isfeasible(a,k,mid)){
                res=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return res;
    }
    public static int maxof(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]> max)
                max=a[i];
        }
        return max;
    }
    public static int sumof(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static boolean isfeasible(int[] a,int k,int res){
         int student=1,sum=0;
         for(int i=0;i<a.length;i++){
             if(sum+a[i]>res){
                 student++;
                 sum=a[i];
             }
             else{
                 sum+=a[i];
             }
         }
         return student<=k;
    }
}
