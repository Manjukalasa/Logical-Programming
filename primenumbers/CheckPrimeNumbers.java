/*Check the given number is prime or Not */

package com.java.primenumbers;
public class CheckPrimeNumbers 
{
	public static boolean check(int num)
	{
		int count=0;
		for(int i=2;i<=num-1;i++)
		{
		if(num%i==0)   
		   {
			count++;
		   }
		}
		if(count==0)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	public static void main(String[] args)  
	{
      System.out.println( check(7));// 2 3 5 7 11 13 17 19 23 29 31
	} 

}
  
