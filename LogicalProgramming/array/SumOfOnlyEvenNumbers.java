package com.java.array;
public class SumOfOnlyEvenNumbers 
{
	public static int sum(int a[])
	{
		int sum=0;
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]%2==0)
			{
			sum=sum+a[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int a []= {1,2,3,4,5};
		System.out.println(sum(a));
	}
}