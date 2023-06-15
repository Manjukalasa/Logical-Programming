package com.java.converting;

public class BinartToDecimalUsingArray
{
public static int convert(int[] num)
//  {
//	int c=0;                         // with special fuction
//	int decimal=0;
//	for(int i=num.length-1;i>=0;i--)
//	{
//		decimal=decimal+(int)Math.pow(2,c)*num[i];
//		c++;
//	}
//		return decimal;
//   }
	
////////////////////////////////////////////////////////////////////////////
    {
	int t=1;  
	int decimal=0;
	for(int i=num.length-1;i>=0;i--)
	{
		decimal=decimal+num[i]*t;
		t=t*2;
	}
	return decimal;
}
	public static void main(String[] args)
	{
		int[]num= {1,0,0,1,1};
     System.out.println(convert(num));
	}

}
