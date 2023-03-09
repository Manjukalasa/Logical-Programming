package com.java.string;
public class StringToCharArrayRevers
{
public static char[] print(String str)
{
	
	char[] c=str.toCharArray();  // //using special function
	int j=0;
	for(int i=c.length-1; i>=0;i--)
	{
		c[j]=str.charAt(i);
		j++;
	}
	return c;
}
	public static void main(String[] args)
	{
	//	print("hello words");
	System.out.println(print("hello words"));
	}
}
