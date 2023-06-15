package com.java.a2Darray;

public class SumOfOnlyRows
{
	public static void main(String[] args) 
	{
int[][]num= {{1,2,3},{4,5,6},{7,8,9}};
for(int i=0;i<=num.length-1;i++)
{
	int sum=0;
	for(int j=0;j<=num[i].length-1;j++)
	{
		sum=sum+num[i][j];
	}
	System.out.println(sum);
}
}
}