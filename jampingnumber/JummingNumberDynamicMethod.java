package com.java.jampingnumber;
public class JummingNumberDynamicMethod
{
	public static boolean check(int num)
	{
		if(num<=10)
		{
			return true;
		}
		else
		{
		int c1=0;
		int a=num;
		while(a!=0)
		{
         c1++;
         a=a/10;
		}
      int c=0;
      while(num>9)
      {
        int b=num%100;
	    if(Math.abs(b%10-b/10)==1)
		   {
		   c++;
		   }
		num=num/10;
      }
		if(c==(c1-1))
		{
			return true;
		}
		else
		{
			return false;
		}
     }
}  
	public static void main(String[] args) 
	{
		System.out.println(check(1234));
		System.out.println(check(1121));
	}
} 