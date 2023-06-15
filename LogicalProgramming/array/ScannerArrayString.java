 package com.java.array;

import java.util.Scanner;

public class ScannerArrayString
{
 public static String[] test(String[] num)
 { 
	 for(int i=0;i<=num.length-1;i++)
     {
	 System.out.print(num[i]+" ");
     }
	 return num;
 }
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size");  //5
   int size=sc.nextInt();
   String [] num=new String[size];
   System.out.println("Enter String elements"); 
   for(int i=0;i<=num.length-1;i++)
   {
    num[i]=sc.nextLine(); 
   }
   test(num);
  sc.close();
}
}
