package com.java.sample;

import java.util.Scanner;

public class ScannerCharInput 
{
 public static void test(char c)
 {
	 System.out.println(c);
 }
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Char");
  char c=sc.next().charAt(0);   // Character Input take only first char
  test(c);
  sc.close();
}
}
