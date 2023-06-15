package com.java.exam;

import java.util.*;
public class ShareDigit
{
	public static boolean shareDigit(int a, int b) 
	{
	if(a%10==b%10 || a%10==b/10 || a/10==b%10 || a/10==b/10)
	return true;
	else
	return false;
	}
		public static void main(String[] args) 
		{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter integer input 1");
	     int a=sc.nextInt();
	     System.out.println("Enter integer input 2");
	     int b=sc.nextInt();
	     System.out.println("Output is="+shareDigit(a,b));
	     sc.close(); 
		}
	}
