package com.java.hackerrank;
import java.util.Scanner;
public class PrintfirstNFBNumbers 
{
public static void test(int num)
{
    int n1=1;
    int n2=1;
    int n3;
    System.out.print(n1+" ");
    System.out.print(n2+" ");
    for(int i=3;i<=num;i++)
    {
        n3=n1+n2;
        System.out.print(n3+" ");
        n1=n2;
        n2=n3;
    }
}
    public static void main(String[] args) 
    {
    	System.out.println("enter number");
     Scanner sc=new Scanner(System.in); // 5
        int num=sc.nextInt();
        test(num);  //   1 1 2 3 5 
        sc.close();
        
    }
}
