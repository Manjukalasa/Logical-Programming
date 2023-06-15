package com.java.arraylist;

import java.util.*;

public class TreeSetUsingScanner
{
	public static TreeSet<Integer> test(TreeSet<Integer> a1)
	{
		return a1;
	}
	public static void main(String[] args) 
	{
     TreeSet<Integer> a1=new TreeSet<Integer>();
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size");
     int size=sc.nextInt();
     System.out.println("enter values");
     for(int i=0;i<=size-1;i++)
     {
    	 a1.add(sc.nextInt());// 1 5 4 3 2 6 1 3 (duplicates not allow)
     }
     System.out.println(test(a1));  //[1, 2, 3, 4, 5, 6]
     sc.close();
	}
}