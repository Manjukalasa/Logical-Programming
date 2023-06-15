package com.java.array;
public class EvenOddEquals
{
	public static boolean evenodd(int a[])
	{
		int even=0;
		int odd=0;
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]!=0 && a[i]%2==0)
			{
				even++;	
			}
			if(a[i]!=0 && a[i]%2!=0)
			{
				odd++;
			}
		}
			if(even==odd)
			{
				System.out.println(even+" "+odd+"-->Even & odd equals");
				return true;
			}
			else
			{
				System.out.println(even+" "+odd+"-->Even & odd not equals");
				return false;
			}	
	}
public static void main(String[] args)
	{
		int a[]= {1,2,3,0,4,5,6};
		System.out.println(evenodd(a));
	}	
}


