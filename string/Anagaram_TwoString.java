package com.java.string;

public class Anagaram_TwoString 
{
	public static boolean print(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[]c1=str1.toCharArray();
		char[]c2=str2.toCharArray();
		sort(c1); //manju
		sort(c2); //manju
		for(int i=0;i<=c1.length-1;i++)
		{
			if(c1[i]!=c2[i])
			{
				return false;
			}
		}
		return true;
	}
	public static char[] sort(char[]c )
	{
		for(int i=0;i<=c.length-1;i++)
		{
			for(int j=i+1;j<=c.length-1;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		return c;		
	}
	public static void main(String[] args) 
	{
		System.out.println(print("manju","manjj"));
		System.out.println(print("manju","ujnam"));
	}

}
