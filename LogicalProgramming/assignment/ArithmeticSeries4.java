package com.java.assignment;

import java.util.Scanner;

public class ArithmeticSeries4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   // 10
		int num=sc.nextInt();
		int n=6;
	    int d=5;
		for(int i=0;i<num;i++)
		{
			System.out.println(n);
			n=n+d;
			d=d+5;
		}
		sc.close();

	}

}
