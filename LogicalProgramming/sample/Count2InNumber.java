package com.java.sample;
import java.util.Scanner;
/*Count how many 2 in number ramg(1-25)*/
public class Count2InNumber
{
	public static void check2(int n) 
{
		int count=0;		
		for(int i=1;i<=n;i++)
	{
		if(i%10==2)   
		{
			count++;
		}
		if(i/10==2)
		{
			 count++;
		}
	}
		System.out.println(count);
}
//   public static void check2(int n)
//{
//		int count=0;		
//		for(int i=1;i<=n;i++)
//	{
//		if(i%10==2 && i/10==2)   
//		{
//			count=count+2;
//		}
//		else if(i%10==2|| i/10==2)
//		{
//			 count++;
//		}
//		else
//		{
//		count=count;
//		}
//	}
//		System.out.println(count);
//}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");   
		int n=sc.nextInt();
		check2(n);
		sc.close();
	}
}
