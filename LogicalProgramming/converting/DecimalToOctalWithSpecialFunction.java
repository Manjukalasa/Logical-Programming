package com.java.converting;
public class DecimalToOctalWithSpecialFunction
{
public static int convert(int num)
{
	int i=0;
	int Octal=0;
	while(num>0)
	{
		int temp =num%8;
		Octal=Octal+temp*(int)Math.pow(10,i);
		num=num/8;
		i++;
	}
	return Octal;
}
	public static void main(String[] args)
	{
     System.out.println(convert(209));//209-->321
	}
}
