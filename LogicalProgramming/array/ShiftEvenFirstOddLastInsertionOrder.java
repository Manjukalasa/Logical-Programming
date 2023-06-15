package com.java.array;
/* Shift Even to first and odd to last result in insertion order & print actual array and initial res array and 
    res array after inserting even and final array */
public class ShiftEvenFirstOddLastInsertionOrder
{
	public static void shift(int [] num)
	{
		helper(num);
		int [] res =new int[num.length];
		helper(res);
		int x=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				res[x]=num[i];
				x++;
			}
		}
		helper(res);
		for(int j=0;j<num.length;j++)
		{
			if(num[j]%2==1)
			{
				res[x]=num[j];
				x++;
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
		int[] num= {5,3,1,6,4,7,2};
		shift(num);

	}

}