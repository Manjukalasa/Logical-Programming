/* 
print pattern like this-->
1 * * *  
* 2 * *
* * 3 *
* * * 4

4 * * *  
* 3 * *
* * 2 *
* * * 1
*/
package com.java.patterns;
public class PatternNumaricsStars 
{
	public static void print(int row,int column)
	{
		 int x=1;  
		 //int x=row;     // revers numbers 
    for(int i=1;i<=row;i++)
    {
	  for(int j=1;j<=column;j++)
	  {
		  if(i==j) 
		 {
	       System.out.print(x+" ");
	         x++;  
	        //  x--;
         }
		 else
		 {
		  System.out.print("*"+" ");
		 }
	  }
	  System.out.println();
      }  
	}
	public static void main(String[] args)
	{
		
		print(4,4);	
	}
}
