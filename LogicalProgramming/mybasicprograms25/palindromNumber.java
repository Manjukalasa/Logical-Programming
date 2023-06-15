package com.java.mybasicprograms25;


public class palindromNumber {
    public static void main(String[] args) {
		int num = 22;
		int org_num = num; //org_num=original number
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (org_num == rev) {
			System.out.println(org_num + " Palindrome Number");
		} else {
			System.out.println(org_num + " Not Palindrome Number");
		}

	}
    
}

