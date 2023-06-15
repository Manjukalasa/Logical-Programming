package com.java.assignment;

//public class AddTwoStrings     // using special function
//{
//public static void main(String[] args)
//{
//String s1="12";
//String s2="15";
//int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
//System.out.println(sum);
//  }
//}
public class AddTwoStrings
{
	public static String convert(String s1,String s2)
	{
		int sum=add(s1)+add(s2);
		String sum1=sum+"";	
	    return sum1;
	}
	public static int add(String s)
	{
		int res=0;
		int t=1;
		for(int i=s.length()-1;i>=0;i--)
		{
			int a=s.charAt(i)-48;
			res=res+a*t;
			t=t*10;
		}
		return res;
		
	}
public static void main(String[] args)
{
	System.out.println(convert("12","15"));
  }
}
