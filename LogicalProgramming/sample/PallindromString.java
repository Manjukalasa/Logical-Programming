package com.java.sample;

import java.util.Scanner;

public class PallindromString 
{
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter size:");
		String num=sc.next();
	   // String num="gadag";
		String rev="";
		for(int i=num.length()-1;i>=0;i--)
		{
			rev=rev+num.charAt(i);
		}
		System.out.print(rev+" is the ");
		if(num.equals(rev))   // it is compare the characters (== compare address)
        //if(num.equalsIgnoreCase(rev))
		{
			System.out.println("Pallindrom word");
		}
		else
		{
			System.out.println("Not a Pallindrom word");
		}
		sc.close();
	}
}
