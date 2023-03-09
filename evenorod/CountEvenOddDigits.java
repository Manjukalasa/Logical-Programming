package com.java.evenorod;
public class CountEvenOddDigits
{
	public static void check(int num)
	{
		int Even=0;
		int odd=0;
		while(num>0)
		{
    int rem=num%10;
	if(rem!=0 && rem%2==0)
	{
		Even++;
	}
	if(rem!=0 && rem%2!=0)
	{
		odd++;
	}
	num=num/10;
	}
	System.out.println(Even +" "+ odd);
	}
	public static void main(String[] args) 
	{
		check(1573240);
	}

}
