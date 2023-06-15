package com.java.array;
import java.util.Scanner;
public class RotateLeftShift
{
	public static int[] leftshift(int[]num)
	{
    int first=num[0];
    for(int i=0;i<=num.length-1;i++)  //   for(int i=0;i<=num.length-2;i++)
    {
    if(i+1<=num.length-1)            // usint above--> if condition is not nessessory
      {
     num[i]=num[i+1];
      }	
    }
	num[num.length-1]=first;
    for(int i=0;i<=num.length-1;i++) 
	  {
		 System.out.print(num[i]+" ");
      }
        //helper(num);                    // calling helper methos
		return num;	
	}
//	public static void helper(int[]n)     // helper method
//	{
//	 for(int i=0;i<=n.length-1;i++) 
//	  {
//		 System.out.print(n[i]+" ");
//	  }
//	}
	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int size=sc.nextInt();
    int[]num=new int[size];
    System.out.println("enter elements");
    for(int i=0;i<=num.length-1;i++)
    {
    	num[i]=sc.nextInt();
    }
    leftshift(num);  // {1,2,3,4,5}--->{2,3,4,5,1}
    sc.close();
	}
}
