package com.java.sample;

import java.util.Scanner;

public class PallindromNumber
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(num>0)
		{
		int rem=num%10;
		sum=sum*10+rem;
		num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Pallindrom");
		}
		else
		{
			System.out.println("Not a Pallindrom");
		}
		sc.close();
	}
}
