package com.java.exam2;

import java.util.Arrays;

public class CheckEqualOrNot  // using with special function
{
	public static boolean check(int[]num1,int[]num2)
	 {
		if(num1.length!=num2.length)
		{
			return false;
		}
	   Arrays.sort(num1);
	   Arrays.sort(num2);
	   for(int i=0;i<=num1.length-1;i++)
	   {
	       if(num1[i]!=num2[i])
	       {
	    	   return false;
	       }
	    }
	return true;
 }
	 public static void main(String[] args)
	 {
	    int[]num1={7,2,1,2,3,1,1};
	    int[]num2={1,2,3,7,2,5,1};
	   System.out.println(check(num1,num2));
 }
}
