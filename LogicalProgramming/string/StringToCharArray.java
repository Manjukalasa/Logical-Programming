package com.java.string;

import java.util.Arrays;

public class StringToCharArray
{
public static char[] print(String str)
{
	//char[] c=str.toCharArray();  //using special function
	char[] c=new char[str.length()];
	for(int i=0; i<=str.length()-1;i++)
	{
		c[i]=str.charAt(i);
	}
	
	System.out.println(Arrays.toString(c));
	
//	for(int j=0; j<=c.length-1;j++)
//	{
//		System.out.print(c[j]+ " ");  // Both posibilities--> output in char array
//	}
	return c;	// it returns value not a address
}
	public static void main(String[] args)
	{
	System.out.println(print("hello words"));
	}

}
