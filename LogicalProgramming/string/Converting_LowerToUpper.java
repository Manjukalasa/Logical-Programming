package com.java.string;

public class Converting_LowerToUpper
{
 public static String convert(String str)
 {
	 String res="";
	 for(int i=0;i<=str.length()-1;i++)
	 {
		 if(str.charAt(i)>=65 &&str.charAt(i)<=90)
		 {
			 res=res+str.charAt(i);
		 }
		 if(str.charAt(i)>=97 &&str.charAt(i)<=122)
		 {
			 res=res+(char)(str.charAt(i)-32);
		 }
	 }
	return res;
	 
 }
	public static void main(String[] args) 
	{
	System.out.println(convert("manju"));

	}
}
