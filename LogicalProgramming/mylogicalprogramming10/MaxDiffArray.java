package com.java.mylogicalprogramming10;
public class MaxDiffArray 
{
	public static int check(int [] num)
	{
		int max = 0 ;
		int sub = 0;
		for(int i=0;i<num.length-1;i++)
		{
			sub = Math.abs(num[i]-num[i+1]);
			if(max < sub)
			{
				max=sub;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int [] num = {12,15,18,25,27};
		System.out.println(check(num));
	}
}