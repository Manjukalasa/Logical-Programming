/* 
print pattern like this-->
* 
* * 
* * * 
* * * * 
* * * * * 

*/
package com.java.patterns;
public class PatternTriangle
{
	public static void main(String[] args)
	{
		int n=5;
    for(int i=1;i<=n;i++)
    {
	  for(int j=1;j<=i;j++)
	  {
	  System.out.print("* ");
      }
	  System.out.println();
      }  
	}
}
