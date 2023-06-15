/* print Nth Prime Numbers (range---> 1<=n<=100 or 1<=n<=1000 ) */

package com.java.primenumbers;
public class NthPrimeNumbers 
{
	public static void check(int n)
	{
		int c=0;
		int nth=0;
		for(int i=2;i<=1000;i++)
		{
		int count=0;
		for(int j=2;j<=i-1;j++)
		{
		if(i%j==0)   
		   {
			count++;
			break;
		   }
		}
		if(count==0)
		{
			nth=i;
			c++;
		}
		if(c==n) 
		{
			break; 
		}
    }
		System.out.print("Nth primr Numbers is: "+nth);
}
	public static void main(String[] args)  
	{
		
      check(10);//2 3 5 7 11 13 17 19 23 29        10th--->29  25th--->97
	} 
}
