package com.java.array;
public class CountZerosInArray 
{
	public static int count(int a[]) 
	{
		int count=0;
		for(int i=0;i<=a.length-1; i++)
		{
			if(a[i]==0)
			{
				count++;
			}
		}
		return count;	
}
	public static void main(String[] args) 
	{
		int a[]= {1,2,0,5,0,0,6};
		System.out.println(count(a));
	}
}