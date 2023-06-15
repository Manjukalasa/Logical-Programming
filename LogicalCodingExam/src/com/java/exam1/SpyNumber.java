package com.java.exam1;
import java.util.Scanner;

public class SpyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter Spy Number:");
		int num=sc.nextInt();
		int n=1;
		int sum=0;
        while(num>0)
		{
		 int r=num%10;
		  sum=sum+r;
	      n=n*r;	 
	     num=num/10;		
		}
        if(sum==n)
        {
       System.out.println("it is spy Number");
        }
        else
        {
        	System.out.println("Not a spy Number");	
        }
		sc.close();

	}


}
