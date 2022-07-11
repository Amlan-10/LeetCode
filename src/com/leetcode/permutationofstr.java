package com.leetcode;//Doubt
import java.util.Scanner;
public class permutationofstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        int n=s.length();
        permute(s,0,n-1);
    }
    static void permute(String s,int l,int r){
        if(l == r){
            System.out.println(s);
            return;
        }
        for(int i=l;i<=r;i++){
            s=swap(s,l,i);
            permute(s,l+1,r);
            s=swap(s,l,i);
        }
    }
    static String swap(String s,int l,int r){
        char temp;
        char [] charArray=s.toCharArray();
        temp=charArray[l];
        charArray[l]=charArray[r];
        charArray[r]=temp;
        return String.valueOf(charArray);
        }
    }

