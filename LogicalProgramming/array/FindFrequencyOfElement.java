package com.java.array;

import java.util.Scanner;

public class FindFrequencyOfElement
{
    public static void searchElemet(int[]num,int key)
    {
    	int count=0;
       for(int i=0;i<=num.length-1;i++)
       {
         if(num[i]==key)
         {
           count++;
         }
    }
       System.out.println("numberb of key elements are: "+count);
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
	    System.out.println("enter key element");
	    int key=sc.nextInt();
        // int[]ar1={1,2,3,1,4,0,7,1};
       //  int key=1;
       searchElemet(num,key);  
       sc.close();
   }
}