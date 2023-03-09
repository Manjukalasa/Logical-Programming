package com.java.string;
public class FindingLowerCase
{
public static void print(String str)
{
	for(int i=0; i<=str.length()-1;i++)
	{
        if(str.charAt(i)>='a' && str.charAt(i)<='z')    // comparing characters
//		if(str.charAt(i)>=97 && str.charAt(i)<=122)    // comparing unicodes
//		if(str.charAt(i)>='0'&& str.charAt(i)<='9')  // comparing characters
//		if(str.charAt(i)>=48 && str.charAt(i)<=57)  // comparing unicodes
//      if(str.charAt(i)>='A' && str.charAt(i)<='Z')  // only upper cases
	{
		System.out.print(str.charAt(i));
	}
	}
}
	public static void main(String[] args)
	{
	print("HhEeLlLlOo");
//	print("H1hEe4LlLlO3o");
	}
}
