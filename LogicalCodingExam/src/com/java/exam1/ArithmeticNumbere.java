package com.java.exam1;
import java.util.Scanner;

public class  ArithmeticNumbere
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");
		int num=sc.nextInt();
		int n=1;
		int d=2;
		for(int i=1;i<=num;i++)
		{
		   System.out.println(n);
		     n=n+d;
		     d++;
			
		}
		sc.close();

	}

}
