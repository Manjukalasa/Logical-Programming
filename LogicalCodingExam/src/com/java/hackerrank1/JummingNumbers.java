package com.java.hackerrank1;
public class JummingNumbers 
{
	public static void check(int num)
	{
		for(int i=0;i<=10;i++)
		{
			if(i<10)
			{
				System.out.print(i+" ");
			}
		}
		for(int i=10;i<=num;i++)
		{
		if(Math.abs(i%10-i/10)==1)
		   {
		 	System.out.print(i+" ");
	    	}
		}
	}
	public static void main(String[] args) 
	{
		check(101);
	}
} 