/* Count Nth Fibonacci Numberss Digits*/

package com.java.fibonaccinumbers;
public class CountNthFibonacciNumberDigit
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
			count++;
			n3=n3/10;
		}
		return count;
	}
}
 public static void main(String[] args) 
{
  System.out.println(test(7)); // 7th-->13-->2 counts     10th-->55-->2 counts
  }
}