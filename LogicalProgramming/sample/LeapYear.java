package com.java.sample;

public class LeapYear
{
	public static boolean leap(int year)
	{
		if(year%400==0 || year%100!=0 && year%4==0)
		{
			System.out.println("----Leap year---");
			return true;
		}
		else
		{
			System.out.println("--------Not a Leap year-----------");
		   return false;
		}
		
	}
  
	public static void main(String[] args) 
	{
        System.out.println(leap(2000));// year is divided by 4 that is leap year not divided by 100
	}                                  //2000 2004  2096 2104 2108--(2100 not a leap Year it is /100)
}
