
/* Shift even number to left in increment order and odd numbers to right in derement order */
package com.java.array;

import java.util.Arrays;

public class ShiftEvenLeftIncAndOddRigthDecOrder
{
	public static void array(int [] num)
	{
		helper(num);
		Arrays.sort(num);
		int [] res =new int[num.length];
		int x=0;
		int y=num.length-1;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2==0)
			{
				res[x]=num[i];
				x++;
			}
			else
			{
				res[y]=num[i];
				y--;
			}
		}
		helper(res);
	}
		public static void  helper(int[]n)
		{
			for(int k =0;k<n.length;k++)
			{
				System.out.print(n[k]+ " ");
			}
			System.out.println();
		}


		public static void main(String[] args) 
		{
			int[] num= {8,3,5,6,7,4,2,1};
			array(num);

		}

	}