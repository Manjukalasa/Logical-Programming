	/*
    	 5
         2 3 1 6 5----> 10 11 1 110 101
     */
package com.java.hackerrank1;
import java.util.Scanner;
public class DecimalToBinaryObjects 
{
 public static String convert(int num)
   {
     String res="";
     while(num>0)
     {
         int rem=num%2;
         res=rem+res;
         num=num/2;
     }
	return res;
 }
      public static String[] abc(int[] n)
     {
          String [] str=new String[n.length];
           for(int i=0;i<=n.length-1;i++)
           {
           String s=convert(n[i]);
               str[i]=s;
               System.out.print((str[i])+" ");
           }
	return str;
  }
    public static void main(String[] args)
    {
//       Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int[]num=new int[size];
//        for(int i=0;i<=num.length-1;i++)
//        {
//            num[i]=sc.nextInt();
//        }
//        abc(num);
//        sc.close();
    	int []num= {1,2,3,4,5};
    	abc(num);
    }
}