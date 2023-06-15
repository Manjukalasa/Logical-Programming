package com.java.mybasicprograms25;
public class RemoveWhileSpacleInString {
    public static void main(String[] args) {

		String str = "Java Programming Language";
		System.out.println("Before removing the while spaces: " + str);

		str = str.replaceAll("\\s", "");
		System.out.println("After  removing the while spaces: " + str);
	}
}
