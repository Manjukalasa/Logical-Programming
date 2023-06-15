package com.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListUsingScanner
{
	public static ArrayList<Integer> test(ArrayList<Integer> a1)
	{
		Collections.sort(a1);
		return a1;
	}
	public static void main(String[] args) 
	{
     ArrayList<Integer> a1=new ArrayList<Integer>();
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size");
     int size=sc.nextInt();
     System.out.println("enter values");
     for(int i=0;i<=size-1;i++)
     {
    	 a1.add(sc.nextInt());// 1 5 4 3 2 6 1 3 2 
     }
     System.out.println(test(a1)); // [1, 1, 2, 2, 3, 3, 4, 5, 6]
     sc.close();
	}
}

// using(void) Return type

//public class ArrayListUsingScanner
//{
//	public static void test(ArrayList<Integer> a1)
//	{
//	Collections.sort(a1);
//    System.out.println(a1);
//	}
//	public static void main(String[] args) 
//	{
//     ArrayList<Integer> a1=new ArrayList<Integer>();
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter size");
//     int size=sc.nextInt();
//     System.out.println("enter values");
//     for(int i=0;i<=size-1;i++)
//     {
//    	 a1.add(sc.nextInt());// 1 5 4 3 2 6 1 3 
//     }
//     test(a1);
//     sc.close();
//	}
//}