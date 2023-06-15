package com.java.converting;

public class DecimalToBinary
{
public static int convert(int num)
{
	int t=1;
	int binary=0;
	while(num>0)
	{
		int rem =num%2;
		binary=binary+rem*t;
		t=t*10;
		num=num/2;
	}
	return binary;
}
	public static void main(String[] args)
	{
     System.out.println(convert(25));
	}

}
