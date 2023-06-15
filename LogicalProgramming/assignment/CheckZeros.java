package com.java.assignment;

public class CheckZeros
{
	public static void check(int num)
	{
		int count=0;
		while(num>0)
		{
    int rem=num%10;
	if(rem==0)
	{
		count++;
	}
	num=num/10;
	}
	System.out.println("number of Zeros = "+count);
	}
	public static void main(String[] args) 
	{
		check(10203040);
	}
}
