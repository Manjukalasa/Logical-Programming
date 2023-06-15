package com.java.mylogicalprogramming10;

public class AddLastTwoFibNumItPrimeReturnTrue
{

	public static boolean check(int num) 
	{
		int n1 = 1;
		int n2 = 1;
		int n3 = 0;
		for(int i = 3;i<=num;i++) 
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		int rem = n2-n1;
		System.out.println(rem);
		for(int i=2;i<=rem-1;i++)
		{
			if(rem%i==0)
			{
				return false;
			}	
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(check(15));
		System.out.println(check(10));
	}
}