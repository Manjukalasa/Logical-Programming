/* print Count Sum of Last Prime Numberss*/
package com.java.primenumbers;
public class CountSumofLastPrimeNumbers 
{
	public static void check(int num)
	{
		int sum=0;
		int count=0;
		int c=0;
		for(int i=2; i<=num; i++)
		{
			count=0;
			for(int j=2; j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && i!=1)
			{
				 sum=sum+i;
			}
		}
		while(sum>0)
		{
			c++;
			sum=sum/10;
		}
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		check(10);//  i/p 10-->2 3  5 7=17--->count is 2 
		check(30);//  i/p 10-->2 3  5 7 11 13 17 19 23=100--->count is 3 
	}
}