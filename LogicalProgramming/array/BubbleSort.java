package com.java.array;

import java.util.Arrays;

public class BubbleSort
{
	public static int[] check(int [] a)
	{
		for (int i = 0; i <= a.length- 1; i++)
		{
			for (int j = 0; j <=a.length- 1; j++)
			{
				if ( j+1<=a.length- 1 && a[j] > a[j + 1])
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int k = 0; k<= a.length- 1; k++)
		{
          System.out.print(a[k]+" ");
		}
		   System.out.println();
		   System.out.println(Arrays.toString(a));
		return a;
	}
	public static void main(String[] args)
	{
		int a[] = { 4, 2, 1, 3, 5 };
		check(a);
	}
		
}