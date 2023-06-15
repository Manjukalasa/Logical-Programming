package com.java.array;

//import java.util.Scanner;

public class SumOfArray 
{
	public static int sum(int a[])
	{
		int sum=0;
		for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);     
//		System.out.println("Enter inputs:");   
//		int a=sc.nextInt();
		int a []= {1,2,3,4,5};
		System.out.println(sum(a));
	}
}
