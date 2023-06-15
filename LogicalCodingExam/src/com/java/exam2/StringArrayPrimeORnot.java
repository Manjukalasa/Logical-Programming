package com.java.exam2;

public class StringArrayPrimeORnot
{
 public static String[] test(String[]num)
 {  
	 for(int i=0;i<=num.length-1;i++)
     {
		 int count=0;
		 String s2=num[i];
		 int n1=s2.charAt(0)-48;
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
	return num;	  
}
public static void main(String[] args)
 {
	 String[]num= {"0","1","2","3","4","5","6","7","8","9","23"};
	 test(num);	 
}
}
