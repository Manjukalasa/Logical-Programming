package com.java.sample;

import java.util.Scanner;

public class AirthmeticSeries2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   // 10
		int num=sc.nextInt();
		int n=2;
		int d=13;
		for(int i=1;i<=num;i++)
		{
			System.out.println(n);             //logic-1
			n=n+d;
			d=d+13;
			//System.out.println((i*(i+1))/2);  //logic-2
		}
		
		sc.close();

	}

}
