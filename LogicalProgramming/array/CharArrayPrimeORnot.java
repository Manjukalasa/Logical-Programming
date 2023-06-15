package com.java.array;
public class CharArrayPrimeORnot
{
 public static void   test(char[]num)
 {  
	 for(int i=0;i<=num.length-1;i++)
     {
		 int n1=num[i]-48;
		 int c=0;
		for(int j=2;j<n1;j++)
		{
			 if(n1%j==0)
			 {
			  c++;
			 }
		}
		if(c==0 && n1!=1) 
		{
			System.out.println(num[i]);
		} 
     }	  
 }
 public static void main(String[] args)
 {
	 char[]num= {'2','1','3','6','5','9','4','7'};
	 test(num);	 
}
}
