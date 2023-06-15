package com.java.exam;

import java.util.Scanner;

public class NearTeen 
{
	public static boolean nearTen(int n)
	{
	if(n%10<=2 || n%10>=8)      // within 2 values    8 9 -(10)0- 1 2
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
     System.out.println("------------------Welcome To JS Coding Exam---------------------");
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter integer input");
     int n=sc.nextInt();
     System.out.println("Output is="+nearTen(n));
     sc.close(); 
	}
}
