package com.java.string;

public class PallindromString 
{
	public static boolean conver(String str) 
	{  
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(str+" "+rev);
		if(str.equals(rev))   // (equls--> compare the characters & ( == compare address)
			//if(num.equalsIgnoreCase(rev))
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
		System.out.println(conver("gadag"));
		System.out.println(conver("manju"));
	}
}
