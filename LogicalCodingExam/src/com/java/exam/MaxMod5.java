
package com.java.exam;
import java.util.*;
public class MaxMod5
{
	public static int maxMod5(int a, int b) 
{
	 if(a%5==b%5 && a>b)
	 {
	 return b;
	 }
	 if(a%5==b%5 && a<b)
	 {
	 return a;
	 }
	 if(a==b)
	 {
	 return 0;
	 }
	 if(a>b)
	 {
	 return a;
	 }
	 else
	 {
	 return b;
	}
}
	public static void main(String[] args) 
	{
     System.out.println("------------------Welcome To Coding Exam---------------------");  
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 1st integer input");
     int a=sc.nextInt();
     System.out.println("Enter 2nd integer input");
     int b=sc.nextInt();
     System.out.println("Output is="+ maxMod5( a,b));
     sc.close(); 
	}

}
