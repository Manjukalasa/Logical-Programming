package com.java.converting;

public class OctalToDecimal
{
public static int convert(int num)
{
	int t=1;
	int decimal=0;
	while(num>0)
	{
		int rem =num%10;
		decimal=decimal+rem*t;
		t=t*8;
		num=num/10;
	}
	return decimal;
}
	public static void main(String[] args)
	{
     System.out.println(convert(321));//1071 --->569
	}

}
