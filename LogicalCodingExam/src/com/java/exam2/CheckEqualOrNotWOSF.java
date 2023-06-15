package com.java.exam2;
import java.util.Arrays;
public class CheckEqualOrNotWOSF  // with out using special function
{
	public static boolean check(int[]num1,int[]num2)
	 {
		if(num1.length!=num2.length)
		{
			return false;
		}
		  // With out Using Spcial function 
	   num1 = sort(num1);// calling helper method again returned back
  	   System.out.println("num1 sorted array: "+Arrays.toString(num1));
	   sort(num2);
	   System.out.println("num2 sorted array: "+Arrays.toString(num2));
	   
	   for(int i=0;i<=num1.length-1;i++)
	   {
	       if(num1[i]!=num2[i])
	       {
	    	   System.out.println("num1 and num2 are not a same");
	    	   return false;
	       }
	    }
	   System.out.println("num1 and num2 are Same");
		return true;
	 }
	   public static int[] sort(int[]num1)  // helper method
		 {
		   for(int i=0;i<=num1.length-1;i++)
		   {
			 for(int j=i+1;j<=num1.length-1;j++)
			 {
		         if(num1[i]>num1[j])
		          {
		    	   int temp =num1[i];
		            num1[i]=num1[j];
		            num1[j]=temp;
		           }
		       }
		    }
		   return num1;
	     }
	 public static void main(String[] args)
	 {
	    int[]num1={7,2,1,2,3};
	    int[]num2={1,2,3,7,1};
	   System.out.println(check(num1,num2));
 }
}
