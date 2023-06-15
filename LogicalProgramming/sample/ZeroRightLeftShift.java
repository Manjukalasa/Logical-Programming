package com.java.sample;
public class ZeroRightLeftShift 
{
//	public static int[] rightside(int[] nums) // 1 2 3 0 0 0 0 --> right shift
//	{
//	int []res=new int[nums.length];
//	int x=0;
//	for(int i=0;i<=nums.length-1;i++)
//	{
//	if(nums[i]!=0)
//	    {
//		res[x]=nums[i];
//		x++;
//	    }
//	}
//	for(int j=0;j<=res.length-1;j++)
//	   {
//		System.out.print(res[j]+" ");
//	  }
//	return res;
//	}
	
	
	public static int[] rightside(int[] nums)   // 0 0 0 0 1 2 3--> left shift
	{
	int []res=new int[nums.length];
	int x=nums.length-1;
	for(int i=nums.length-1;i>=0;i--)
	{
	if(nums[i]!=0)
	    {
		res[x]=nums[i];
		x--;
	    }
	}
	for(int j=0;j<=res.length-1;j++)
	   {
		System.out.print(res[j]+" ");
	  }
	return res;
	}
	public static void main(String[] args) 
	{
         int[]nums= {1,0,0,2,0,0,3};
	       rightside(nums); 
	}
	}
