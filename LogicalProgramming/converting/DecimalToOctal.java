package com.java.converting;

public class DecimalToOctal
{
public static int convert(int num)
{
	int t=1;
	int Octal=0;
	while(num>0)
	{
		int rem =num%8;
		Octal=Octal+rem*t;
		t=t*10;
		num=num/8;
	}
	return Octal;
}
	public static void main(String[] args)
	{
     System.out.println(convert(209));//209-->321
	}
}
