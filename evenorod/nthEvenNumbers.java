package com.java.evenorod;
import java.util.Scanner;

public class nthEvenNumbers 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   
		int n=sc.nextInt();
		int res=0;
		for(int i=1;i<=n*2;i++)
		{
			res=i;
		}
		System.out.println(res);
		sc.close();
	}
}
