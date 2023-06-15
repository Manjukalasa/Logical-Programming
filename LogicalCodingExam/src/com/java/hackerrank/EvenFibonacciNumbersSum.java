package com.java.hackerrank;

import java.util.Scanner;

public class EvenFibonacciNumbersSum
{
    public static void fib(int N)
    {
        int n1=1;
        int n2=1;
        int n3=0;
        int sum=0;
        System.out.print("The fib series is \t\t:"+n1+" ");
        System.out.print(n2);
        for(int i=3;i<=N;i++)
        { 
            n3=n1+n2;
            System.out.print(" "+n3);
           if(n3%2==0 && n3<=N)
           { 
        	  sum=sum+n3;
        	 
           } 
           if(N==n3)
           {
           	break;
           }
            n1=n2;
            n2=n3;
          
        } 
        System.out.println(" ");
        System.out.println("The even sum of fib series \t:"+sum);
    }
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter");
        int N = sc.nextInt();
        fib(N);
        sc.close();
    } 
}
