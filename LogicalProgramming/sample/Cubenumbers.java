package com.java.sample;

import java.util.Scanner;

public class Cubenumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");    //10
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println(i*i*i);
		}
		
		sc.close();

	}
}
