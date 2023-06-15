/* print (1-n)Prime Numbers  (range---> 1<=n<=10)*/
package com.java.primenumbers;
public class A1TonPrimeNumbers
{
	public static void check(int n)
	{
		for(int i=2;i<=n;i++)
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
		}
	  }
	}
	public static void main(String[] args)  
	{
      check(10);
	} 
}

