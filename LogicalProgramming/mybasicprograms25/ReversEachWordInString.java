package com.java.mybasicprograms25;

public class ReversEachWordInString {
    public static void main(String[] args) {
		String str = "Welcome to Java";
		String[] words = str.split("\\s");
		String reverseword = " ";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();

			reverseword= reverseword + sb.toString() + " ";
		}
		System.out.println(reverseword);
	}
}
