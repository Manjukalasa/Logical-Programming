package com.java.array;
public class CountEvenNumbers 
{
	public static int count(int []a)
	{
		int count=0;
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]!=0 && a[i]%2==0)
			{
				count++;
			}	
		}
		return count; // only single int value using int / using group of array int[]
	}
	public static void main(String[]args)
	{
		int arr[]= {2,4,5,7,0,8};
		System.out.println(count(arr));
	}
}
