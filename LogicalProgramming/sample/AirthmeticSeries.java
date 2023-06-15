package com.java.sample;

import java.util.Scanner;

public class AirthmeticSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   
		int num=sc.nextInt();
		int n=1;
		for(int i=1;i<=num;i++)
		{
			System.out.println(n);
			n=n+3;
		}
		
		sc.close();

	}

}
