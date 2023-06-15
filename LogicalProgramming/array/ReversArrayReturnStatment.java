package com.java.array;

public class ReversArrayReturnStatment
{	public static int[] check(int [] a) 
	{
	for(int i=a.length-1; i>=0; i--) 
	{
  		System.out.println(a[i]);
	}
	return a;
}
   public static void main(String[] args) 
   {
			int arr[]= {10,20,30,40,50};
			//check(arr);
			System.out.println(check(arr));
}
}