package com.java.a2Darray;

public class SumOf1stRows
{
	public static void main(String[] args) 
	{
int[][]num= {{1,2,3},{4,5,6},{7,8,9}};
int sum=0;
for(int i=0;i<=num.length-1;i++)
{
	for(int j=0;j<=num[i].length-1;j++)
	{
		
		if(i==0)
		{
		sum=sum+num[i][j];//1+2+3=6
	    }
    }
}
System.out.println(sum);
}
}