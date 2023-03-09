package com.java.jampingnumber;
public class JampingNumber3didgitsStatic
{
	public static boolean check(int num)
	{
      int a=0;
      int b=num%100;
		if(Math.abs(b%10-b/10)==1)
		   {
		   a++;
		   }
		num=num/10;
		if(Math.abs(num%10-num/10)==1)
		{
		    a++;
		   }
		if(a==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}  
	public static void main(String[] args) 
	{
		System.out.println(check(123));
	}
} 