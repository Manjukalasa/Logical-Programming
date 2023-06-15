package com.java.string;

public class  PrintUniqueElements2 
{
		public static void print(String str)
		{
         char[]c=str.toCharArray();
			for(int i=0; i<=c.length-1;i++)
			{
				int count=0;
			   for(int j=i+1; j<=c.length-1;j++)
			   {
				if(c[i]== c[j])
		        {
				 count++;
				 c[j]='1';
		    	}
			   }
  		     if(c[i]!='1' && count==0)
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
