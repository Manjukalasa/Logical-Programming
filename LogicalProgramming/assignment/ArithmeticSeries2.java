package com.java.assignment;

import java.util.Scanner;

public class ArithmeticSeries2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   // 10
		int num=sc.nextInt();
		int n=2;
		for(int i=0;i<num;i++)
		{
			System.out.println(n);
			n=(n*2)-i;
		}
		sc.close();

	}

}
