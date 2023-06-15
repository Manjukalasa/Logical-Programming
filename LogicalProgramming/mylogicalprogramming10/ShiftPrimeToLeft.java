package com.java.mylogicalprogramming10;

import java.util.Arrays;

public class ShiftPrimeToLeft
{
	public static int [] check(int [] num)
	{
		int [] res = new int[num.length];
		int k=0;
		
		for(int i=0;i<res.length ;i++)
		{
			int count=0;
			for(int j=2;j<=num[i]-1;j++)
			{
				if(num[i]%j==0)
				{
					count++;
				}	
			}
			if(count==0)
			{
				
				res[k]=num[i];
				//System.out.print(res[k]+" ");
				k++;
			}
		}
		for(int i=0;i<res.length;i++)
		{
			int count=0;
		for(int j=2;j<=num[i]-1;j++)
		{
			
			if(num[i]%j==0)
			{
				count++;
			}	
		}
		if(count>0)
		{
			res[k]=num[i];
			//System.out.print(res[k]+" ");
			k++;
		}
		}
		System.out.println(Arrays.toString(res));
		return res;
	}
	public static void main(String[] args) {
    	int [] num={18,20,7,15,11,13};
		check(num);
		
	}
}