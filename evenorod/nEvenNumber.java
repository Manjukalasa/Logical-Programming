package com.java.evenorod;
import java.util.Scanner;

public class nEvenNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i*2);
		}
		sc.close();
	}
}
