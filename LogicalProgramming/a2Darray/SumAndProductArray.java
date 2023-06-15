package com.java.a2Darray;

public class SumAndProductArray {
	public static void main(String[] args) 
	{
int[][]num= {{1,2,3},{4,5,6},{7,8,9}};
//int sum=0;
int pro=1;
for(int i=0;i<=num.length-1;i++)
{
	for(int j=0;j<=num[i].length-1;j++)
	{
		//sum=sum+num[i][j];
		pro=pro*num[i][j];
	}		
}
//System.out.print(sum); // 15
System.out.print(pro);   //362880
}
}
