package com.java.evenorod;
public class LastDigitEvenOdd 
{
	public static void lastdigit(int num) 
	{
		  int rem=num%10;
			switch(rem%2)
			{
		    case 0:System.out.println("Even number");
			break;
		    default:System.out.println("Odd number");
			}
			num=num/10;
	}
	public static void main(String[] args) 
	{
		lastdigit(2456);
	}

}
