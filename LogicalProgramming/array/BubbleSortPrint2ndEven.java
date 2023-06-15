package com.java.array;
public class BubbleSortPrint2ndEven
{
	public static int[] sort(int [] a)
	{
		for (int i = 0; i <= a.length- 1; i++)
		{
			for (int j = 0; j <=a.length- 1; j++)
			{
				if ( j+1<=a.length- 1 && a[j] > a[j + 1])
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		int c=0;
		for (int k = 0; k<= a.length- 1; k++)
		{
			System.out.print(a[k]+" ");
			if(a[k]%2==0)
			{
				c++;
			}
			if(a[k]%2==0 && c==2)
			{
				System.out.println();
            System.out.print("second even no is:"+a[k]+" ");
            break;
	    	}
		}
		return a;
	}
	public static void main(String[] args)
	{
		int a[] = {1,6,2, 1, 3, 5,8};
		sort(a);
	}
		
}