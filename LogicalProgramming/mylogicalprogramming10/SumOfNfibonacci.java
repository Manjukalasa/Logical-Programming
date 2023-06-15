package com.java.mylogicalprogramming10;

/* print Sum of N even Fibonacci Numberss*/
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
		for(int i=1;i<=num-2;i++)
		{
			n3=n1+n2;
			if(n3%2==0)
			{
			sum=sum+n3;
			}
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

