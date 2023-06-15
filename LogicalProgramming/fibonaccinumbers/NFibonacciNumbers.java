/* print N Fibonacci Numberss*/

package com.java.fibonaccinumbers;
public class NFibonacciNumbers
{
public static void test(int num)
{
	int n1=0;
	int n2=1;
	int n3;
	System.out.println(n1);
	System.out.println(n2);
	for(int i=3;i<=num;i++)
	{
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
}
	public static void main(String[] args) 
	{
    test(10);  //0 1 1 2 3 5 8 13 21 34
	}

}
