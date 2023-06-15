package com.java.arraylist;

import java.util.*;
public class ArrayListUsingScanner1
{
	public static List<Integer> test(List<Integer> a1)
	{
		Collections.sort(a1);
		return a1;
	}
	public static void main(String[] args) 
	{
     List<Integer> a1=new ArrayList<Integer>();
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size");
     int size=sc.nextInt();
     System.out.println("enter values");
     for(int i=0;i<=size-1;i++)
     {
    	 a1.add(sc.nextInt());// 1 5 4 3 2 6 1 3 
     }
     System.out.println(test(a1));
     sc.close();
	}
}