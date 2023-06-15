/* print Sum of Nth Fibonacci Numberss*/

package com.java.fibonaccinumbers;
public class SumOfNthFibonacciNumberdigitSum
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
		for(int i=1;i<=num-2;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		while(n3>0)
		{
			int r=n3%10;
			sum=sum+r;
			n3=n3/10;
		}
		return sum;
	}
}
 public static void main(String[] args) 
{
	    System.out.println(test(10)); // 55=5+5=10
}
}
