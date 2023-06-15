package com.java.string;

public class Sample {

	public static void main(String[] args)
	{
	 Sample s1=new Sample();
	 Sample s2=new Sample();
	 System.out.println(s1.hashCode());//giving integer--->HashCode Values(212628335...)
	 System.out.println(s1);           // FullyqualifiedClassName @ HexadecimalHashCodeValues
	 System.out.println(s1.toString());// FullyqualifiedClassName @ HexadecimalHashCodeValues
	 System.out.println(s1.equals(s2));//false
	 System.out.println(s1.equals(s1));//true

	}

}
