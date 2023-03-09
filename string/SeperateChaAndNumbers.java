package com.java.string;

public class SeperateChaAndNumbers 
{
	public static void print(String str)
	{
		String str1="";
		int res=0;
		for(int i=0; i<=str.length()-1;i++)
		{
	        if((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a' && str.charAt(i)<='z'))
	        {
			str1=str1+str.charAt(i);
	    	}
	        if(str.charAt(i)>='0' && str.charAt(i)<='9')
	        {
			res=res*10+(str.charAt(i)-48);
	    	}
		}
	  System.out.println(str1);
	  System.out.println(res);
	}
		public static void main(String[] args)
		{
		print("Manju123");
		}
}
