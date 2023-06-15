package com.java.array;

public class MaxNumber
{
	public static int count(int a[]) 
	{
		int max=0;
		for(int i=0;i<=a.length-1; i++)
		{
			if(a[i]>max)
			{
			max=a[i];
			}
		}
		return max;	
}
	public static void main(String[] args) 
	{
		int a[]= {4,2,1,7,8,5};
		System.out.println(count(a));
	}
}
