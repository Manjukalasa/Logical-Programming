package com.java.string;

public class DifferentiateUpperLower 
{
	public static void print(String str)
	{
		String str1="";
		String str2="";
		for(int i=0; i<=str.length()-1;i++)
		{
	        if(str.charAt(i)>='A' && str.charAt(i)<='Z')
	        {
			str1=str1+str.charAt(i);
	    	}
	        if(str.charAt(i)>='a' && str.charAt(i)<='z')
	        {
	        	str2=str2+str.charAt(i);
	    	}
		}
	  System.out.println(str1);
	  System.out.println(str2);
	}
		public static void main(String[] args)
		{
		print("HhEeLlLlOo");
		}
}
