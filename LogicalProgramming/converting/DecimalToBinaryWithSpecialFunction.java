package com.java.converting;
public class DecimalToBinaryWithSpecialFunction
{
public static int convert(int num)
{
	int i=0;
	int Binary=0;
	while(num>0)
	{
		int temp =num%2;
		Binary=Binary+temp*(int)Math.pow(10,i);
		num=num/2;
		i++;
	}
	return Binary;
}
	public static void main(String[] args)
	{
     System.out.println(convert(25));
	}
}
