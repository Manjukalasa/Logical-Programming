package com.java.converting;

public class DecimalToBinaryString
{
public static String convert(int num)
{
	String res=" ";
	while(num>0)
	{
		int rem =num%2;
          res=rem+res;   //100011
		//res=res+rem;  //110001
		num=num/2;
	}
	return res;
}
	public static void main(String[] args)
	{
     System.out.println(convert(35));
	}

}
