package com.java.sample;

public class ArmStrongNumberDynamicMethod
{
	public static String check(int num)
	{   
		int t1=num;
		int t2=num;
		int sum=0;
	    int count=0;
	    while(t1>0)
		{
			count++;
			t1=t1/10;
		}
		while(t2>0)
		{
			int r=t2%10;
			sum=sum+(int)Math.pow(r, count);
			t2=t2/10;
		}
		if(num==sum)
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
        System.out.println(check(1634));//153 370 371 1634 8208 9474
	}
}
