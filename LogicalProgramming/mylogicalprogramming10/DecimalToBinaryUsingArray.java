package com.java.mylogicalprogramming10;
public class DecimalToBinaryUsingArray
{
public static int[] convert(int num)  // only one loop
{
	int m=num;
	int c=0;
	int i=0;
	while(num>0)
	{
	  c++;
	   num=num/2;
	}
	int[]a=new int[c];
	while(m>0)
	{
		a[i]=m%2;
	  	m=m/2;
	  	i++;
	}
	for(int j=a.length-1;j>=0;j--)
	{
		System.out.print(a[j]+" ");
	}
     //System.out.print(Arrays.toString(a));
	return a;
 }
	public static void main(String[] args)
	{
     convert(35);
	}
}

