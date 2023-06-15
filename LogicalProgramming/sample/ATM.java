package com.java.sample;

import java.util.Arrays;

public class ATM 
{
public static int atm(int[]a,int num)
{
 Arrays.sort(a);
 System.out.println(Arrays.toString(a));
 int sum=0;
 for(int i=a.length-1;i>=0;i--)
 {
  int count =num/a[i];
  int rem=num%a[i];
  num=rem;
  sum=sum+count;
  }
return sum;
}
	public static void main(String[] args)
	{
   int []a= {10,500,1000,20,2000,50,100};
   System.out.println( atm(a,5570));
	}

}
