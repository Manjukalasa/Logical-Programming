package com.java.string;

public class ConvertingArrayToString
{
public static String print(int[]num)
{
	String res="";
	for(int i=0; i<=num.length-1;i++)
	{
  res=res+num[i];
	}
	return res;	
}
	public static void main(String[] args)
	{
		int[] num= {1,2,3,4,5};
	System.out.println(print(num));
	}

}
