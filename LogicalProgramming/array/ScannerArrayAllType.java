package com.java.array;
import java.util.Scanner;
public class ScannerArrayAllType
{
 public static int[] test(int [] num)
 { 
    for(int i=0;i<=num.length-1;i++)
 {
	 System.out.print(num[i]+" ");
 }
	return num;
 }
 public static String[] test(String [] num1)
 { 
    for(int i=0;i<=num1.length-1;i++)
 {
	 System.out.print(num1[i]+" ");
 }
	return num1;
 }
 public static char[] test(char [] num2)
 { 
    for(int i=0;i<=num2.length-1;i++)
 {
	 System.out.print(num2[i]+" ");
 }
	return num2;
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
    num[i]=sc.nextInt(); 
   }
   
   String [] num1=new String[size];
   System.out.println("Enter String elements"); 
   for(int i=0;i<=num1.length-1;i++)
   {
    num1[i]=sc.next(); 
   }
   char [] num2=new char[size];
   System.out.println("Enter Characters elements"); 
   for(int i=0;i<=num2.length-1;i++)
   {
    num2[i]=sc.next().charAt(0); 
   }
    test(num);
    test(num1);
    test(num2);
    sc.close();
}
}
