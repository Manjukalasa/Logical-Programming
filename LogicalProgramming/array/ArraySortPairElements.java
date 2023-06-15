package com.java.array;
import java.util.Arrays;
public class ArraySortPairElements 
{
		public static int[] check(int[]num1)
		 {
		   Arrays.sort(num1);
		   System.out.println(Arrays.toString(num1));
		   int count=0;
		   for(int i=0;i<=num1.length-1;i++)
		   {
		       if(i+1<=num1.length-1 && num1[i]==num1[i+1])
		       {
		    	  count++;
		      	  i++;   
		       }
		    }
		   System.out.println(count);
		return num1;
	 }
		 public static void main(String[] args)
		 {
		    int[]num1={1,2,1,4,2,3,4,5,2,4,1,2,6};
		     check(num1);
	 }
	}
