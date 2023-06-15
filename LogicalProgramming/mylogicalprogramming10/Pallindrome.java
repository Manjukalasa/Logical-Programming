package com.java.mylogicalprogramming10;

import java.util.Arrays;

public class Pallindrome 
{

	public static int [] check(int [] num)
	{
		int [] res = new int[num.length];
		int rem=0;
		int rem1 =0;
		int j= 0;
		for(int i=0;i<res.length;i++)
		{
			rem = num[i]%10;
			rem1=num[i]/10;
			rem=rem*10;
			rem1=rem+rem1;
			if(rem1==num[i])
			{
				res[j]=num[i];
						j++;
			}
		}
		System.out.println(Arrays.toString(res));
		return res;
	}
	
	public static void main(String[] args) {
		int [] num = {22,33,44,75,81,99};
		check(num);
	}
}