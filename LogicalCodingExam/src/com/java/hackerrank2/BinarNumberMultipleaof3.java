package com.java.hackerrank2;
import java.util.*;
public class BinarNumberMultipleaof3
{
    public static int check(String num)
    {
        int sum=0;
        int t=1;
    for(int i=num.length()-1;i>=0;i--)
    {
       int res=num.charAt(i)-48;
        sum=sum+t*res;
        t=t*2;
    }
        if(sum%3==0)
        {
            return 1;
        }
        else
        {
        return 0;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String n1=sc.next();
        System.out.println(check(n1));
        sc.close();
    }
}