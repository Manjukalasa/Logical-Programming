package com.java.array;

public class MinNumber
	{
		public static int count(int a[]) 
		{
			int min=a[0];
			for(int i=0;i<=a.length-1; i++)
			{
				if(a[i]<min)
				{
				min=a[i];
				}
			}
			return min;	
	}
		public static void main(String[] args) 
		{
			int a[]= {4,2,1,7,8,5};
			System.out.println(count(a));
		}
	}
