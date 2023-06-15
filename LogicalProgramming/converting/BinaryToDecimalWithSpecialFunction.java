package com.java.converting;
public class BinaryToDecimalWithSpecialFunction
{
public static int convert(int num)
{
	int i=0;
	int Decimal=0;
	while(num>0)
	{
		int temp =num%10;
		Decimal=Decimal+temp*(int)Math.pow(2,i);
		num=num/10;
		i++;
	}
	return Decimal;
}
	public static void main(String[] args)
	{
     System.out.println(convert(11001));
	}
}
