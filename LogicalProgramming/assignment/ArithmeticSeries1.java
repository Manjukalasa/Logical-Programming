package com.java.assignment;

import java.util.Scanner;

public class ArithmeticSeries1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   // 10
		int num=sc.nextInt();
		int n1=1;
		int n2=2;
		int n3=5;
		System.out.print(n1+" "+n2+" "+n3+" ");
		for(int i=4;i<=num;i++)
		{
		   int n4=n1+n2+n3;
		   System.out.print(n4+" ");  // 1 2 5  8 15 28 51 94 173 318
		   n1=n2;
		   n2=n3;
		   n3=n4;
			
		}
		sc.close();

	}

}
