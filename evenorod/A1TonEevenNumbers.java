package com.java.evenorod;
import java.util.Scanner;

public class A1TonEevenNumbers 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		if(i%2==0)   
		   {
			System.out.println(i);
		   }
		}
		System.out.println("---------------------------------------------");
		for(int i=1;i<=n;i++)
		{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	  }
		sc.close();
	}
}
