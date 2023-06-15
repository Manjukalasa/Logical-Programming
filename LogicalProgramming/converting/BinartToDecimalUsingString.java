package com.java.converting;

public class BinartToDecimalUsingString
{
	public static int convert(String num)
	{
	int decimal=0;
	int t=0;
	int n=0;
		for(int i=num.length()-1;i>=0;i--)
		{
		n=num.charAt(i)-48;// '1'--->49-48=1
		//decimal=decimal+n*(int)Math.pow(2, i);  // spcial function
		decimal=decimal+n*t;
		t=t*2;
	    }
		return decimal;
	}
		public static void main(String[] args)
		{
	     System.out.println(convert("10011"));
	     System.out.println(convert("11001"));
		}
}