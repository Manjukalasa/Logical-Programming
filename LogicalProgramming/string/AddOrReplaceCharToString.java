package com.java.string;

public class AddOrReplaceCharToString {
	public static String add(String str,int index,char c)
	{
		if(index<=str.length()-1)
		{
			return str.substring(0,index)+c+str.substring(index+1); //abzd
			//return str.substring(0,index)+c+str.substring(index); //abzcd
		
		}	
		return str;
	}
	public static void main(String[] args) 
	{
	System.out.println(add("abcd",2,'z'));
	}

}
