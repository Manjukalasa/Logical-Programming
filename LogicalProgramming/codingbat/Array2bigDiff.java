package com.java.codingbat;
import java.util.*;
public class Array2bigDiff 
{
	public static int bigDiff(int[] nums) 
	{
	int  max=nums[0];
	int min=nums[0];
	for(int i=0;i<=nums.length-1;i++)
	{
	  if(nums[i]>max)
	  {
	    max=nums[i];
	  }
	  if(nums[i]<min)
	  {
	    min=nums[i];
	  }
	}
	return max-min;
	}
	  public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter size");
		  int size=sc.nextInt();
		  int[]arr=new int[size];
		  System.out.println("enter int inputs ");
		  for(int i=0;i<=arr.length-1;i++)
		   {
		    arr[i]=sc.nextInt(); 
		   }
		 System.out.println(bigDiff(arr)); 
		 sc.close();
	}
}
