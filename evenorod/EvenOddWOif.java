package com.java.evenorod;
public class EvenOddWOif
{
public static void main(String[] args)
{
		int a=20;
// without using if condition
//	switch(a%2)
//	{
//    case 1:System.out.println("odd number="+ a);
//	break;
//    default:System.out.println("even number="+ a);
//	}
	
	
	// without using % symbol
	if((a/2)*2==a)
	{
		System.out.println("Even number="+ a);
	}
	else
	{
	System.out.println("odd number="+ a);
}
}
}