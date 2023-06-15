package com.java.fibonaccinumbers;

public class FibonacciString 
{
public static void convert(int n,int key)
{
	int n1=1;
	int n2=1;
	String sum="11";
	for(int i=3;i<=n;i++)
	{
		int n3=n1+n2;
		sum=sum+n3;  
		n1=n2;
		n2=n3;
	}
	System.out.println(sum);                 // 11235813213455  
	System.out.println(sum.charAt(key-1));   // (10-1=9--->1)
	//System.out.println(sum.charAt(key));   // (10--->3)
}
	public static void main(String[] args) 
	{
    convert(10,10);
	}

}
