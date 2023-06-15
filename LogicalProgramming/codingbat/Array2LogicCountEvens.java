package com.java.codingbat;

import java.util.Scanner;

public class Array2LogicCountEvens
{
	public static int countEvens(int[] nums) 
	{
	int count=0;
	for(int i=0;i<=nums.length-1;i++)
	{
	  if(nums[i]%2==0)
	  {
	    count++;
	  }
	}
	return count;
	}

public static void main(String[] args) 
{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter size");  //5
	   int size=sc.nextInt();
	   int [] num=new int[size];
	   System.out.println("Enter int elements"); 
	   for(int i=0;i<=num.length-1;i++)
	   {
	    num[i]=sc.nextInt(); 
	   }
	System.out.println(countEvens(num)); 
	sc.close();
}
}
