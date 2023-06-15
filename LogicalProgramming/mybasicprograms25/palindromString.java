package com.java.mybasicprograms25;

public class palindromString {
	public static void main(String[] args) {
		String str="nayan";
		String rev ="";
		int len =str.length();
		for (int i = len-1; i >= 0; i--) {
			rev = rev +str.charAt(i);
		}
		if (str.equals(rev))
		{
			System.out.println(str + " is Palindrome String");
		}
		 else 
		{
			System.out.println(str + " is Not Palindrome String");
		}
	}

}


