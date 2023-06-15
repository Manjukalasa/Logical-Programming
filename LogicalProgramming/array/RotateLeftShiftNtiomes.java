package com.java.array;
import java.util.Scanner;
public class RotateLeftShiftNtiomes
{
	public static int[] shift(int[]num,int n)
	{
    for(int i=1;i<=n;i++) 
    {
    	   int first=num[0];
    for(int j=0;j<=num.length-1;j++)
    {
    if(j+1<=num.length-1)      
      {
     num[j]=num[j+1];
      }	
    }
	num[num.length-1]=first;
    }
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
    System.out.println("enter number of ratation");
    int n=sc.nextInt();
    shift(num,n);  // {1,2,3,4,5},3--->{5,4,1,2,3}
    sc.close();
	}
}
