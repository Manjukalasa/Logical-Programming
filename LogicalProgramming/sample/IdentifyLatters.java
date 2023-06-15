package com.java.sample;

public class IdentifyLatters 
{
	public static void test(char a)
	{
		if(a>='A' && a<='Z')
		{
			System.out.println(a+"-UPPERCASE LETTERS-"+a);
		}
		else if(a>='a' && a<='z')
		{
			System.out.println(a+"-lower case letters");
		}
		else if(a>='0' && a<='9')
		{
			System.out.println(a+"-numarical numbers");
		}
		else
			{
				System.out.println(a+"-Invalid number");
			}
	}
	public static void main(String[] args)
	{
	test('H');
	test('m');
	test('7');
	test('$');

	}

}
