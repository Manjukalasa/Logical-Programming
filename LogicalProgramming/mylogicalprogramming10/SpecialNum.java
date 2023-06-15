package com.java.mylogicalprogramming10;

public class SpecialNum
{
	public static boolean check(int num)
	{
		int sum = 0;
		int res3=0;
		int res4=0; 
		int res5 = 0;
		while(num>0)
		{
			int rem = num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(sum>9)
		{
			int res=sum%10;
			int res1=sum/10;
			int res2=res1+res;
			if(res2>9)
			{
				res3=res2%10;
				res4=res2/10;
				res5=res3+res4;
			}
			else 
			{
				res5=res2;
			}
		}
		else
		{
			res3=sum%10;
			res5=res3;	
		}
		if(res5==1)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(check(1018));//7444--->7+4+4+4-->19-->1+9-->10-->1+0=1
	}
}