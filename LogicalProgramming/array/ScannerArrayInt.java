 package com.java.array;

import java.util.Scanner;

public class ScannerArrayInt 
{
 public static int[] test(int[]num)
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
   int [] num=new int[size];
   System.out.println("Enter int elements"); 
   for(int i=0;i<=num.length-1;i++)
   {
    num[i]=sc.nextInt();   // 1 2 3 4 5 
   }
   
   test(num);
  sc.close();
}
}
