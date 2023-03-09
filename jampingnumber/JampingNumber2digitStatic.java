package com.java.jampingnumber;
public class JampingNumber2digitStatic  // static method
{
	public static void check(int num)
	{
		for(int i=1;i<=10;i++)
		{
			if(i<=9)
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
		check(99);
	}
} 