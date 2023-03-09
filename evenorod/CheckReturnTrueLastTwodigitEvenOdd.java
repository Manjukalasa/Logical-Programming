package com.java.evenorod;
public class CheckReturnTrueLastTwodigitEvenOdd 
{
	public static boolean lasttwoeven(int num)
	{
		int n=num%100;
		int count=0;
		while(n>0)
		{
    int rem=num%10;
	if(rem%2==0)
	{
		count++;
	}
	n=n/10;
	}
		if(count==2)
	{
	return true;
	}
	else
	{
	  return false;	
	}
}
	public static void main(String[] args) 
	{
		System.out.println(lasttwoeven(1342568));
	}
}

