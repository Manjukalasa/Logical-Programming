package com.java.array;
public class ArraySort
{
	public static void main(String[] args) {
		int a[] = { 4, 2, 1, 3, 5 };
		for (int i = 0; i <=a.length- 1; i++) 
		{
			for (int j = i+1; j <=a.length- 1; j++)
			{
				 if (a[i] > a[j]) // acending order 
			   //if (a[i] < a[j])  // decending order
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}   
			}
		}
		for (int i= 0; i<=a.length- 1; i++)
		{ 
			System.out.println(a[i]);
		}
//		Arrays.sort(a);  
//		System.out.println(Arrays.toString(a));
	}
}