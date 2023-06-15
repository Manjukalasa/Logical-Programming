package com.java.exam2;
public class ArrayElementsToBinaryObjects
{
	public static int[] convert(int[] num)
	{
	int []a=new int[num.length];
	for(int i=0;i<=num.length-1;i++)
	{
		int sum=0;
		int c=0;
		while(num[i]>0)
		{
			int rem=num[i]%2;
			sum=sum+rem*(int)Math.pow(10,c);
			c++;
			num[i]=num[i]/2;
		}
		a[i]=sum;
		System.out.print(a[i]+" ");
	}
	return a;
}
public static void main(String[] args)
{
	int [] num= {1,2,3,4,5};
	convert(num);
}
}
