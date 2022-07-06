package com.leetcode;
import java.util.Scanner;//find position of setbit
public class Position {
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        System.out.println(findPosition(N));
    }
    static int findPosition(int N){
        int count=0;
        if(N==0||(N&(N-1))!=0)
            return -1;
        while(N>0){
            if((N&1)==1)
                break;
            N=N>>1;
            count++;
        }
        return count+1;
    }
}

