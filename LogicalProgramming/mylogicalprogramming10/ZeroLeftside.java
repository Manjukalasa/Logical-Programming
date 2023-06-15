package com.java.mylogicalprogramming10;

import java.util.Arrays;

public class ZeroLeftside 
{
	public static int[] shift(int[] nums) 
	{
		  int x=0;
		  int[] res = new int[nums.length];
		  
		  for (int i = 0; i <=nums.length-1; i++) 
		  {
		    if (nums[i]== 0) 
		    {
		      res[x] = nums[i];
		//      System.out.print(res[x]+" ");  // without string output
		      x++;
		    }
		  }
		  for (int j = 0; j <=nums.length-1; j++) 
		  {
		    if (nums[j] > 0) 
		    {
		      res[x] = nums[j];
		    //  System.out.print(res[x]+" ");
		      x++;
		    } 
		  }
		System.out.println(Arrays.toString(res));
		return res;
	 }
public static void main(String[] args) 
	{
	
	int[]nums= {0,1,2,0,3,0,4,5};
	shift(nums);
	}
}
