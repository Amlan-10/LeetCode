package com.leetcode;
import java.util.Scanner;
import java.util.HashMap;
public class Romantonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(romanToInt(s));
    }
        public static int romanToInt(String s) {
            int n=s.length();

            HashMap<Character,Integer> Roman=new HashMap<>();{{
                Roman.put('I',1);
                Roman.put('V',5);
                Roman.put('X',10);
                Roman.put('L',50);
                Roman.put('C',100);
                Roman.put('D',500);
                Roman.put('M',1000);
            }};
            int res=Roman.get(s.charAt(n-1));
            for(int i=n-2;i>=0;i--){
                if(Roman.get(s.charAt(i))>Roman.get(s.charAt(i+1)) || Roman.get(s.charAt(i))==Roman.get(s.charAt(i+1)))
                {
                    res=res+Roman.get(s.charAt(i));
                }
                else{
                    res=res-Roman.get(s.charAt(i));
                }
            }
            return res;
        }
    }
