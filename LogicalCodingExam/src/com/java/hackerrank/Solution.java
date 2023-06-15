package com.java.hackerrank;

import java.util.Scanner;

public class Solution 
{
	public static int check(int num)
	{
		int count=0;
		for(int i=2;i<=num-1;i++)
		{
		if(num%i==0)   
		   {
			count++;
		   }
		}
		if(count==0)
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
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
           System.out.println(check(n)); 
           sc.close();
    }
}