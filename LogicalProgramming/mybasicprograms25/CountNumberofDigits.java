package com.java.mybasicprograms25;

public class CountNumberofDigits {
    public static void main(String[] args) {

		int num = 6541;
		int count = 0;
		// for(int i=0;i<=num;i++)
		while (num > 0) 
		{
			num = num / 10;
			count++;
		}
		System.out.println("Number of Digits: " + count);
	}
}

