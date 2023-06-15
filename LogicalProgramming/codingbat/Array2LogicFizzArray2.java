package com.java.codingbat;
import java.util.Scanner;
public class Array2LogicFizzArray2
{
public static int[] fizzArray(int n)
{
int[]res=new int[n];
for(int i=0;i<n;i++)
{
  res[i]=i;
  System.out.print(res[i]+" ");
}
return res;
}
public static void main(String[] args) 
{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter size");  //5
	   int size=sc.nextInt();  
       fizzArray(size); 
	   sc.close();
}
}
