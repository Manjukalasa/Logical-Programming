package com.java.array;
import java.util.Scanner;
public class RotateRigthShift
{
	public static int[] leftshift(int[]num)
	{
    int last=num[num.length-1];
    for(int i=num.length-1;i>=0;i--)  
    {
    if(i-1>=0)      
      {
     num[i]=num[i-1];
      }	
    }
	num[0]=last;
    for(int i=0;i<=num.length-1;i++) 
	  {
		 System.out.print(num[i]+" ");
      }
		return num;	
	}

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
    leftshift(num);  // {1,2,3,4,5}--->{5,1,2,3,4}
    sc.close();
	}
}
