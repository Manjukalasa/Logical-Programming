package com.java.codingbat;

import java.util.Scanner;

public class Array2Sum13 
{
	public static int sum13(int[] nums)
	{
	  int sum=0;
	for(int i=0;i<=nums.length-1;i++)
	{
	if(i+1<=nums.length-1&& nums[i]==13 && nums[i+1]==13 )
	{
	 i=i+2;
	}
	  else if(nums[i]==13)
	  {
		i++;
	  }
	  else
	  {
	  sum=sum+nums[i];
	}
	}
	return sum;
	}
public static void main(String[] args) 
{
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter size"); 
		   int size=sc.nextInt();
		   int [] num=new int[size];
		   System.out.println("Enter int elements"); 
		   for(int i=0;i<=num.length-1;i++)
		   {
		    num[i]=sc.nextInt(); 
		   }
		System.out.println(sum13(num)); 
		sc.close();
	}
}
