package com.java.sample;


public class PallindromStringArray
{
	public static void main(String[] args) 
	{  
	    String[] num= {"g","a","d","a","a"};
		String[] rev= new String[num.length];
		for(int i=num.length-1;i>=0;i--)
		{
			rev[i]=num[i];
			System.out.print(rev[i]);
		}
	
//		if(num[i]==rev[i]) 
//        //if(num.equalsIgnoreCase(rev))
//		{
//			System.out.println("Pallindrom word");
//		}
//		else
//		{
//			System.out.println("Not a Pallindrom word");
//		}
	}
}

