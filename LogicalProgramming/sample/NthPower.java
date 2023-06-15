package com.java.sample;

public class NthPower
{
	public static int check(int value,int power)
	{
//		int a=(int)Math.pow(value, power);   // using Specile function--->by default Double
//		return a;
		int res=1;
		for(int i=1;i<=power;i++)
		{
		res=res*value;
		}
		return res;
	}
	public static void main(String[] args) 
	{
       System.out.println(check(2,4));
	}

}
