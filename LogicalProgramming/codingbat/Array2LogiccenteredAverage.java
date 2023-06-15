package com.java.codingbat;
import java.util.Scanner;
public class Array2LogiccenteredAverage
{
	public static int centeredAverage(int[] nums) 
	{
	  int sum=0;
	int  max=nums[0];
	int min=nums[0];
	for(int i=0;i<=nums.length-1;i++)
	{
	  sum=sum+nums[i];
	  if(nums[i]>max)
	  {
	    max=nums[i];
	  }
	  if(nums[i]<min)
	  {
	    min=nums[i];
	  }
	}
	return (sum-max-min)/(nums.length-2);
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
	 System.out.println(centeredAverage(arr)); 
	 sc.close();}
}
