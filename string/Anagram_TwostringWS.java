package com.java.string;

import java.util.Arrays;

public class Anagram_TwostringWS 
{
	public static void  check(String s1,String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[]c1=s1.toCharArray();
		char[]c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1,c2)) 
		{
			System.out.println("is a anagram");
		}else {
			System.out.println("not a anagram");
		}
	 }
	public static void main(String[] args) {
		check("manju","MnaJu");
		check("manju","maaJu");
	}
}