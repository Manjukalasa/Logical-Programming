package com.java.string;

public class Anagaram_SingleStringWOsort 
{
	public static boolean print(String str)
	{
		str=str.toLowerCase();
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(print("manju"));
		System.out.println(print("mmanju"));
	}

}
