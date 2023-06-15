package com.java.mylogicalprogramming10;

public class OneToNPefectNum 
{

	public static void check(int n)
	{
		for(int i=2;i<=n;i++)
		{
			int sum = 1;
			for(int j = 2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(i==sum)
			{
				System.out.println(sum);
			}
		}
	}
	public static void main(String[] args) {
		//check(100);
		check(1000);
	}	
}