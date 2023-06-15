/* print Sum of last two Fibonacci Numberss*/

package com.java.fibonaccinumbers;
public class SumOfLastTwoFibonacciNumbers
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
	    System.out.println(test(10));
		}
}
