package com.java.array;

public class PrintUniqueElements
{
	public static void main(String[] args)   // logic 2 
	{
	  int num[]= {8,5,3,7,5,4,7,10,6,8,8,9};
	  for(int i=0;i<=num.length-1; i++)
		{
		  int count=0;
		for(int j=i+1;j<=num.length-1; j++)
		{
			if( num[i]!=-1 && num[i]==num[j])
			{
				count++;
				num[j]=-1;
			}
		}
			if(num[i]!=-1 && count==0)
			{
			System.out.println(num[i]);
			}
	  }
   }
}