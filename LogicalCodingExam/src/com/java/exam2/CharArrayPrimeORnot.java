package com.java.exam2;

public class CharArrayPrimeORnot
{
 public static void test(char[]num)
 {  
	 for(int i=0;i<=num.length-1;i++)
     {
		 int n1=num[i]-48;
		 int count=0;
		for(int j=2;j<n1;j++)
		{
			 if(n1%j==0)
			 {
			  count++;
			 }
		}
		if(n1>=2 && count==0) 
		{
			char c1=(char)(n1+48); 
			System.out.println(c1);
		} 
     }	  
 }
 public static void main(String[] args)
 {
	 char[]num= {'0','1','2','3','4','5','6','7','8','9'};
	 test(num);	 
}
}
