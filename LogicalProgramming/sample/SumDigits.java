package com.java.sample;
public class SumDigits 
{
public static int sum(int num)
{
	int sum=0;
	//int sum=1;            // using multiplication
	while (num>0)
	{
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
//		int rem=num%10;     // using multiplication  
//		sum=sum*rem;
//		num=num/10;
	}
	return sum;
}
	public static void main(String[] args)
	{
      System.out.println("sum of number is="+sum(1234));
	}

}
