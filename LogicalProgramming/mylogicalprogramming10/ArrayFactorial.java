package com.java.mylogicalprogramming10;
import java.util.Scanner;
public class ArrayFactorial 
{
	public static void check(int [] num) {
		
		int res[]=new int [num.length];
		for(int i=0;i<num.length;i++) {
			int fact=1;
			for(int j=1;j<=num[i];j++) {
				fact=fact*j;
			}
			res[i]=fact;
			System.out.print(res[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n= sc.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();//1 2 3 4 5---> 1 2 6 2 24 120 
		}
		check(a);
		sc.close();
	}
}