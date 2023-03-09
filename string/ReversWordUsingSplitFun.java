package com.java.string;

public class ReversWordUsingSplitFun
{
public static String reverseword(String str)
{
	String res="";
	String[] s=str.split("[.]");
	for(int i=s.length-1;i>=0;i--)
	{
		res=res+s[i]+".";
	}
	return res.substring(0,res.length()-1);	
}
	public static void main(String[] args) 
	{
  System.out.println(reverseword("i.like.this.program"));
  System.out.println(reverseword("i,like,this,program"));
	}

}
