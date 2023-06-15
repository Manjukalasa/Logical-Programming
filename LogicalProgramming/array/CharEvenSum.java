package com.java.array;
public class CharEvenSum
{
	public static int count(char []num) 
	{
		int sum=0;
		for(int i=0;i<=num.length-1; i++)
		{
			int a=num[i]-48;
			if(a%2==0)
			{
			      sum=sum+a;
			}
		}
		return sum;	
}
	public static void main(String[] args) 
	{
	 	char []num= {'1','2','3','5','8','4'};
		System.out.println(count(num));
	}
}