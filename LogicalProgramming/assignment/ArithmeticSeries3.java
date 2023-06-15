package com.java.assignment;

import java.util.Scanner;

public class ArithmeticSeries3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   // 10
		int num=sc.nextInt();
		int n=1;
		int d=8;
		for(int i=1;i<=num/2;i++)
		{
		  System.out.println(n);
		  n=(n+d*i);
		  System.out.println(n);
		  n=(n+d*i);
			
		}
		sc.close();

	}

}
