package com.java.exam1;
import java.util.Scanner;
public class SumOflastTwoFN
{
 public static int test(int num)
	{
		int n1=1;
		int n2=1;
		int n3=0;
		int sum=0;
		if(num==1)
		{
			return n1;
		}
		else if(num==2)
		{
			return n1+n2;
		}
		else
		{	
			sum=n1+n2;
		for(int i=1;i<=num-2;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			sum=n1+n2;
		}
		System.out.print(n1+"+"+n2+"=");
		return sum;
	}
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

