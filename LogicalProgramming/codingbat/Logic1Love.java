package com.java.codingbat;
import java.util.*;
public class Logic1Love
{
public static boolean love6(int a,int b)
{
	if(a==6 || b==6 || a+b==6 || Math.abs(a-b)==6)
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
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first int");
	int a=sc.nextInt();
	System.out.println("Enter first int=");
	int b=sc.nextInt();
	System.out.println("output is="+love6(a,b));
	sc.close();
	// 2nd type Method
//	public static void main(String[] args) 
//	{
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter first int");
//	int a=sc.nextInt();
//	System.out.println("Enter first int");
//	int b=sc.nextInt();
//	if(a==6 || b==6 || a+b==6 || Math.abs(a-b)==6)
//	{
//		System.out.println(" true");
//	}
//	else
//	{
//		System.out.println(" false");
//	}
//	}
	}

}
