package com.java.codingbat;
import java.util.Scanner;
public class Array2LogicFizzArray
{
public static String[] fizzArray2(int nums) 
{
String[]res=new String[nums];
for(int i=0;i<=res.length-1;i++)
{
	res[i]=i+"";
	System.out.print(res[i]+" ");
}
System.out.print(res[0]+res[1]);
return res;
}
public static void main(String[] args) 
{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter size");  //5
	   int size=sc.nextInt();  
       fizzArray2(size); 
	   sc.close();
}
}
