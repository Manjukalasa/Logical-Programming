package com.java.exam1;
import java.util.Scanner;
public class CountOddDigitNthFibonacciNumber
{
 public static int test(int num)
	{
		int n1=1;
		int n2=1;
		int n3=0;
		int count=0;
		if(num==1 || num==2)
		{
			return 1;
		}
		for(int i=1;i<=num-2;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		while(n3>0)
		{
			int r=n3%10;
			if(r%2!=0)
			{
				count++;
			}
			n3=n3/10;
			
		}
		return count;
}
 public static void main(String[] args) 
		{
	 Scanner sc=new Scanner(System.in);     
		System.out.println("Enter inputs:");
		int num=sc.nextInt();
	    System.out.println(test(num));
	    sc.close();
		}
 
}
