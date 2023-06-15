package com.java.array;

import java.util.Arrays;
import java.util.Scanner;
public class EvenOddLeftRigth 
{
	public static int[] evenOdd(int[] nums) 
	{
		  int x=0;
		  int[] res = new int[nums.length];
		  
		  for (int i = 0; i <=nums.length-1; i++) 
		  {
		    if (nums[i] % 2 == 0) 
		    {
		      res[x] = nums[i];
		      x++;
		    }
		  }
		  for (int j = 0; j <=nums.length-1; j++) 
		  {
		    if (nums[j] % 2 != 0) 
		    {
		      res[x] = nums[j];
		      x++;
		    } 
		  }
		 System.out.println(Arrays.toString(res));
		return res;
	 }
public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int size=sc.nextInt();
	int[]nums=new int[size];
	System.out.println("enter array elements");
	for(int i=0;i<size;i++)
	{
		nums[i]=sc.nextInt();
	}
	//int[]nums= {1,4,5,3,7,2,6};
	evenOdd(nums);
	sc.close();
	}
}
