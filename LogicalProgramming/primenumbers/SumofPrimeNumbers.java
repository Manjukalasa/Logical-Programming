/* print Sum of N Prime Numberss*/

package com.java.primenumbers;
public class SumofPrimeNumbers 
{
	public static void check(int num)
	{
		int sum=0;
		for(int i=2; i<=num;i++)
		{
			int count=0;
			for(int j=2; j<=i-1;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && i!=1) //  if(count==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
}
	public static void main(String[] args)
	{
		check(10);//2 3  5 7=17
		check(5);//2 3  5 =10
		check(12);// 2 3 5 7 11=28
	}
}