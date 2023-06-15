package com.java.sample;

public class ElectricBill
{
	public static int check(int unit)    // logic 1
	{
	if(unit<=100)
	{
		return 0;
	}
	else if(unit>100 && unit<=200)
	{
		return 0+(unit-100)*5;
	}
	else
	{
		return 0+500+(unit-200)*10;
	}
  }
	
	
	
	
//		int count=0;                   // logic 2
//	for(int i=1;i<=unit;i++)
//	{
//		if(i<=100)
//		{
//			count=count+0;
//		}
//		else if(i>100 && i<=200)
//		{
//			count=count+5;
//		}
//		else
//		{
//			count=count+10;		}
//    }
//	return count;
//   }
	
	
//	public static int check(int unit)     //logic 3 using nested if
//	{
//	if(unit>100)
//	{
//	if(unit<=200)
//	{
//		unit=unit-100;
//		unit=unit*5;
//		return unit;
//	}
//	else
//	{
//		unit=unit-200;
//		unit=unit*10;
//		unit=unit+100*5;
//		return unit;
//	}
//  }
//	return 0;
//  }
	
	public static void main(String[] args)
	{
      System.out.println(check(350));
	}

}
