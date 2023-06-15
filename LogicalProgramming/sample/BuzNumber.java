package com.java.sample;
import java.util.Scanner;
public class BuzNumber
{
	public static boolean buzcheck(int num)
 {
      int lastdigit=num%10;
	 if(num%7==0 || lastdigit%7==0)
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
		System.out.println("Enter inputs:");
		int num=sc.nextInt();
		System.out.println(buzcheck(num));
		sc.close();
	}
}

