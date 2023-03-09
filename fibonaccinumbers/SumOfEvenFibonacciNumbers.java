package com.java.fibonaccinumbers;

/* print Sum Of Even Fibonacci Numbers*/

public class SumOfEvenFibonacciNumbers
{
	public static int test(int num)
	{
		int n1=0;
		int n2=1;
		int n3=0;
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
		return n3;
	 }
		public static void main(String[] args) 
		{
	    System.out.println(test(10));
		}

	}

