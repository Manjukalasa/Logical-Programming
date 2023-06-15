package com.java.jampingnumber;
public class LastJampingNumbers 
{
	public static int check(int num)
	{
		int res=0;
		for(int i=10;i<=num;i++)
		{
		if(Math.abs(i%10-i/10)==1)
		{
			res=i;
		}
		}
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.print(check(99));
	}
} 