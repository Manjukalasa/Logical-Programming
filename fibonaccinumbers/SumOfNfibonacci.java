/* print Sum of N Fibonacci Numberss*/

package com.java.fibonaccinumbers;
public class SumOfNfibonacci 
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
			sum=sum+n3;
			n1=n2;
			n2=n3;
		}
		return sum;
	}
}
 public static void main(String[] args) 
		{
	    System.out.println(test(10)); // 1+1+2+3+5+8+13+21+34+55=143
		}


}

