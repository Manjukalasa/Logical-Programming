package com.java.string;

public class CountWordHowManyTimePresent {
public static int count(String str,String key)
{
	int ln=key.length();
	int count=0;
	for(int i=0;i<=str.length()-1;i++)
	{
		if(i+(ln-1)<=str.length()-1 && str.substring(i, i+ln).equals(key))
		{
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) 
	{
     System.out.println(count("hi hellohello hi","hello"));
     System.out.println(count("hi hello hi hello hi","hi"));
	}
}
