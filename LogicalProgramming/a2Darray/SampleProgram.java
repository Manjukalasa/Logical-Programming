package com.java.a2Darray;

public class SampleProgram {

	public static void main(String[] args) 
	{
int[][]num=new int[3][3];
System.out.println(num.length);    //  outer array
System.out.println(num[0].length); // inner array
for(int i=0;i<=num.length-1;i++)
{
	for(int j=0;j<=num[i].length-1;j++)
	{
		System.out.print(num[i][j]+" ");
	}
System.out.println();			
}
System.out.println("-------------------------------------------------");
num[0][0]=1;
num[1][1]=5;
num[2][2]=9;
for(int i=0;i<=num.length-1;i++)
{
	for(int j=0;j<=num[i].length-1;j++)
	{
		System.out.print(num[i][j]+" ");
	}
System.out.println();			
}
}
}
