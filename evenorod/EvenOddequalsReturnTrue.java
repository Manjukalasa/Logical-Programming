package com.java.evenorod;
import java.util.Scanner;
public class  EvenOddequalsReturnTrue
{
	public static boolean check(int num)
	{
		int even=0;
		int odd=0;
		while(num >0)
		{
    int rem=num%10;
    num=num/10;
	if(rem!=0 && rem%2==0)
	{
		even++;
	}
	if(rem!=0 && rem%2!=0)
	{
		odd++;
	}
	}
	if(even==odd)
	{
	return true;
	}
	else
	{
	  return false;	
	}
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter inputs:");
		int num=sc.nextInt();
		System.out.println(check(num));
		sc.close();
	}
}
