package com.java.string;

public class CheckPasswordSrong_Weak 
{
public static String pswd(String str)
{
 	if(str.length()<8)
 	{
 		return "weak pswd";
 	}
 	if(str.charAt(0)>=48 && str.charAt(0)<=57)
 	{
 		return "weak pswd";
 	}
 	int spl=0;
 	int up=0;
 	for(int i=0;i<=str.length()-1;i++)
 	{
 	 	if(str.charAt(i)>=65 && str.charAt(i)<=90)
 	 	{
 	 		up++;
 	 	}
 	 	if(!(str.charAt(i)>=65 && str.charAt(i)<=90 ||str.charAt(i)>=97 && str.charAt(i)<=122 ||str.charAt(i)>=48 && str.charAt(i)<=57))
 	 	{
 	 		spl++;
 	 	}
 	}
 	if(up>=1 && spl>=1)
 	{
 		return "Strong pswd";
 	}
 	return "weak pswd";
}
	public static void main(String[] args) 
	{	
	System.out.println(pswd("manju"));
    System.out.println(pswd("123@Manju"));
    System.out.println(pswd("manju@123"));
    System.out.println(pswd("Manju@123"));
    System.out.println(pswd("manjU@123"));
    
	}

}
