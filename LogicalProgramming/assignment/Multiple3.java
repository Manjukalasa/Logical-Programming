package com.java.assignment;
public class Multiple3 
{
	public static void check(int num)
	{
		int multi=0;
		int onmulti=0;
		while(num>0)
		{
    int rem=num%10;
	if(rem%3==0)
	{
		multi++;
	}
	else
	{
		onmulti++;
	}
	num=num/10;
	}
	System.out.println("multiplide by numbers= "+multi +" ---------"+"Not multiplide by numbers= "+onmulti);
	}
	public static void main(String[] args) 
	{
		check(1349624);
	}

}
