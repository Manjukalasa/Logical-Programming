package com.java.string;

public class RemoveDuplicateElements 
{
		public static void print(String str)
		{
         char[]c=str.toCharArray();
			for(int i=0; i<=c.length-1;i++)
			{
			   for(int j=i+1; j<=c.length-1;j++)
			   {
				if(c[i]== c[j])
		        {
				 c[j]='1';
		    	}
			   }
  		     if(c[i]!='1')
		        {
  		    	 System.out.print(c[i]);
		        }
			}
		}
	public static void main(String[] args)
	{
		print("manjuman");
	}
}
