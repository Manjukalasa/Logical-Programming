/* 
print pattern like this-->
1 2 3 
A B C 
4 5 6
D E F
*/
package com.java.patterns;
public class PatternAlpaNumarics1
{
	public static void print(int row,int column)
	{
	 char c='A';
	 int n=1;
    for(int i=1;i<=row;i++)
    {
	  for(int j=1;j<=column;j++)
	  {
		  if(i%2!=0)
		 {
	       System.out.print(n+" ");
	       n++;
         }
		 else
		 {
		  System.out.print(c+" ");
		  c++;
		 }
	  }
	  System.out.println();
      }  
	}
	public static void main(String[] args)
	{
		
		print(4,3);	
	}
}
