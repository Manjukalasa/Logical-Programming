package com.java.a2Darray;

public class AddTwoMatricsDiagonally
{
	public static void check(int [][]num1,int [][]num2)
	{
		for(int i=0;i<=num1.length-1;i++)
		{
			int sum=0;
			for(int j=0;j<=num1[i].length-1;j++)
			{
				if(i==j)
				{
					sum=num1[i][j]+num2[i][j];  //1+5=6 5+3=8 9+2=11
				}
	     	}
			System.out.println(sum);
     	}
   }
	public static void main(String[] args) 
	{
int[][]num1= {{1,2,3},{4,5,6},{7,8,9}};
int[][]num2= {{5,7,6},{1,3,4},{3,1,2}};
    check(num1,num2);
}
}
