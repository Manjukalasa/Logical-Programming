package com.java.exam;

import java.util.*;

public class WithOutDouble 
{
	public static int withoutDoubles(int die1, int die2, boolean noDoubles) 
{
		  if(noDoubles==true)
     {
		    if (die1 == die2)
		   {
		      if (die1 != 6)
		      {
		        return die1 + 1 + die2;
		      }
		      else
		      {
		        return 1 + die2;
		      }
		    }
       }
		  return die1 + die2;
}		   
public static void main(String[] args) 
{
 System.out.println("------------------Welcome To JS Coding Exam---------------------");
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter integer input 1");
 int die1=sc.nextInt();
 System.out.println("Enter integer input 2");
 int die2=sc.nextInt();
 System.out.println("Enter boolean input ");
 boolean noDoubles=sc.nextBoolean();
 System.out.println("Output is="+ withoutDoubles(die1, die2,noDoubles));
 sc.close(); 
}
}
