package com.java.string;

public class MultiplicationTwoString 
{
	public static String print(String str1,String str2)
	{
		int res1=0;
		int res2=0;
		for(int i=0; i<=str1.length()-1;i++)
		{
			res1=res1*10+(str1.charAt(i)-48);
	    }
		for(int i=0; i<=str2.length()-1;i++)
		{
			res2=res2*10+(str2.charAt(i)-48);
	    }
     	return res1*res2+"";
	//	return res1+res2+"";
	}
		public static void main(String[] args)
		{
		System.out.println(print("123","2"));
		}
}

