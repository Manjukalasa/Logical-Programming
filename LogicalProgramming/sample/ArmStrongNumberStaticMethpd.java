package com.java.sample;

public class ArmStrongNumberStaticMethpd
{
	public static String check(int num)
	{
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		if(sum==temp)
		{
			return "Armstrong Numbers";
		}
		else
		{
		   return "Not a Armstrong Numbers";
		}
		
	}
  
	public static void main(String[] args) 
	{
        System.out.println(check(153));
	}
}
