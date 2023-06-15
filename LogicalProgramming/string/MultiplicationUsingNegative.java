package com.java.string;

public class MultiplicationUsingNegative
{
	public static String print(String str1,String str2)
	{
		int res1=0;
		int res2=0;
		for(int i=0; i<=str1.length()-1;i++)
		{
			  if(str1.charAt(i)>=48 && str1.charAt(i)<=57)
		        {
				res1=res1*10+(str1.charAt(i)-48);
		    	}
	    }
		for(int i=0; i<=str2.length()-1;i++)
		{
			if(str2.charAt(i)>= 48 && str2.charAt(i)<=57)
	        {
			res2=res2*10+(str2.charAt(i)-48);
	    	}
	    }
		int res=res1*res2;
			if(str1.charAt(0)==45 ^ str2.charAt(0)==45)
	        {
			return "-"+res;
	    	}
			return res+"";
	}
		public static void main(String[] args)
		{
		System.out.println(print("5","4"));
		System.out.println(print("-5","4"));
		System.out.println(print("5","-4"));
		System.out.println(print("-5","-4"));
		}
}

