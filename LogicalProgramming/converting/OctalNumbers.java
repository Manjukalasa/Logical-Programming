package com.java.converting;

public class OctalNumbers
{
public static long convert(long num)
{
	int c=0;
	while(num>0)
	{
		int rem =(int)num%8;
		//int rem =(int)num%10;
		if(rem==1)
		{
			c++;
		}
		num=num/8;
		//num=num/10;
	}
	return c;
}
	public static void main(String[] args)
	{
		long n=011011100l;
     System.out.println(convert(n));// octal because stat from 0
  //  System.out.println(convert(1110110110));// decimal value
     }

}
