package com.java.sample;
import java.util.Scanner;
public class ScannerStringInput 
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter String");
     String s=sc.next();    // hello world--->hello
  // String s=sc.nextLine();  // hello world--->hello world 
  System.out.println(s);
  sc.close();
}
}
