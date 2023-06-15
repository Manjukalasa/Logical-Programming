package com.java.string;

public class Anagaram_SingleString 
{
	public static boolean print(String str)
	{
		str=str.toLowerCase();
		char[]c=str.toCharArray();
		sort(c);
		for(int i=0;i<=c.length-1;i++)
		{
			if(i+1<=c.length-1 && c[i]==c[i+1])
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
		System.out.println(print("manju"));
		System.out.println(print("mmanju"));
	}

}
