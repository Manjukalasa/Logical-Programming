/*
10
3
2 4 6 8 10 12 14 16 18 20----->8 10 12 14 16 18 20 2 4 6
 */
package com.java.hackerrank1;
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
    System.out.println("enter number of ratation");
    int n=sc.nextInt();
    int[]num=new int[size];
    System.out.println("enter elements");
    for(int i=0;i<=num.length-1;i++)
    {
    	num[i]=sc.nextInt();
    }
    shift(num,n);  // {1,2,3,4,5},3--->{3,4,5,1,2}
    sc.close();
	}
}
