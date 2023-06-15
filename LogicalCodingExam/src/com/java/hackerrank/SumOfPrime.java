package com.java.hackerrank;

import java.util.Scanner;
public class SumOfPrime
{
    public static int check(int num)
    {
        int sum=0;
        int count=0;
        for(int i=2; i<=num; i++)
        {
            count=0;
            for(int j=2; j<=i/2;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0 )
            {
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void main(String[] args) 
    {
    	System.out.println("enter number");
        Scanner sc=new Scanner(System.in);//5
            int num=sc.nextInt();
      System.out.println(check(num));  // 10
      sc.close();
    }
}