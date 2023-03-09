/* 
print pattern like this-->
1 2 3 4
A B C D
1 2 3 4
A B C D
*/
package com.java.patterns;
public class PatternAlpaNumarics 
{
	public static void print(int row,int column)
	{
    for(int i=1;i<=row;i++)
    {
      char c='A';
	  for(int j=1;j<=column;j++)
	  {
		  if(i%2!=0) 
		 {
	       System.out.print(j+" ");
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
		
		print(4,4);	
	}
}
