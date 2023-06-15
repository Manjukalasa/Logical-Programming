package com.java.converting;

public class CombinationNumbers
{
//public static int convert(int n1,int n2)
//{
//	int c=0;
//	int temp=n2;
//	while(temp>0)
//	{
//	  c++;
//	  temp=temp/10;
//	}
//	int res=(int) Math.pow(10,c);
//	return n1*res+n2;
//}
	public static int convert(int n1,int n2)
	{
		int c=0;
		int temp=n1;
		while(temp>0)
		{
		  c++;
		  temp=temp/10;
		}
		int res=(int) Math.pow(10,c);
		return n2*res+n1;
	}
	public static void main(String[] args)
	{
     System.out.println(convert(13,5));
	}

}
