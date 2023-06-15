package com.java.mylogicalprogramming10;
public class PrintPrimeDigits
{
	public static void prime(int num)
	{
		while(num>0)
		{
			int rem=num%10;
			int count =0;
			for(int i=2;i<rem;i++)
			{
				if(rem%i==0)
				{
					count++;
				}
			}
			if(count==0 && rem!=0 && rem!=1)
			{
				System.out.print(rem);
			}
			num=num/10;
		}
	}
	public static void main(String[] args) {
	int num=523471407;
		prime(num);
	}
}