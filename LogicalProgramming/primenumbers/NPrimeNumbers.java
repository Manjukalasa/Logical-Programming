/* print N Prime Numbers (range---> 1<=n<=100 or 1<=n<=1000 ) */

package com.java.primenumbers;
public class NPrimeNumbers 
{
	public static void check(int n)
	{
		int c=0;
		for(int i=2;i<=100;i++)
		{
		int count=0;
		for(int j=2;j<=i-1;j++)
		{
		if(i%j==0)   
		   {
			count++;
		   }
		}
		if(count==0)
		{
			System.out.print(i+" ");
			c++;
		}
		if(c==n)
		{
			break; 
		   //return;
		}
    }	
}
	public static void main(String[] args)  
	{
      check(10);//2 3 5 7 11 13 17 19 23 29   10th--->29
	} 
}
