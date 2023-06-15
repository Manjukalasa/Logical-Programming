package com.java.mylogicalprogramming10;
public class ArmStrongNumberStaticMethpd
{
	public static boolean check(int num)
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
			return true;
		}
		else
		{
		   return false;
		}
		
	}
  
	public static void main(String[] args) 
	{
        System.out.println(check(153));
	}
}
