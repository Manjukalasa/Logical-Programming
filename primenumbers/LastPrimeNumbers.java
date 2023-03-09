/* print last Prime Numbers*/

package com.java.primenumbers;
public class LastPrimeNumbers 
{
	public static void check(int n)
	{
		int last=0;
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
		    last=i;
		}
    }
		System.out.println("Last primr Numbers is: "+last);
}
	public static void main(String[] args)  
	{
      check(10);// 10-->7 
      check(20);// 20-->19
	} 
}
