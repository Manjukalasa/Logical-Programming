package com.java.evenorod;
import java.util.Scanner;

public class SumofnEvenNumbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i*2);
		}
//		int sum=0;
//		for(int i=1;i<=n*2;i++)
//		{
//			if(i%2==0)
//			{
//			sum=sum+(i*2);
//		}
//		}
		System.out.println(sum);
		sc.close();

	}

}
