package com.java.sample;

public class ArmStrongNumberWithoutSpecialFunction
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
		
//			int r=t2%10;
//			sum=sum+(int)Math.pow(r, count);  // Special function
//			t2=t2/10;
			
			int res=1;
			int r=t2%10;
			for(int i=1;i<=count;i++)
			{
				res=res*r;
			}
			sum=sum+res;
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
        System.out.println(check(153));//153 370 371 1634 8208 9474
	}
}

