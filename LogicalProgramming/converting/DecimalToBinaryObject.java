package com.java.converting;

import java.util.Arrays;
import java.util.Scanner;
public class DecimalToBinaryObject
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
           }
      System.out.println(Arrays.toString(str));
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
    	int[]num= {5,4,1,13};
        abc(num);
//        sc.close();
    }
}