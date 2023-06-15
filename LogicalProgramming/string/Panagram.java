package com.java.string;

public class Panagram {
  public static String check(String str)
  {
	  if(str.length()<26)
	  {
		  return "no";
	  }
	  str=str.toLowerCase();
	  String res="abcdefghijklmnopqrstuvwxyz";
	  for(int i=0;i<=res.length()-1;i++)
	  {
		  int count=0;
		  for(int j=0;j<=str.length()-1;j++)
		  {
			if(res.charAt(i)==str.charAt(j))
			{
				count++;
			}
	      }
		  if(count==0)
		  {
			  return "no";
		  }
	  }
		  return "Yes";
  }
	public static void main(String[] args)
	{
     System.out.println(check("manju"));
     System.out.println(check("abcdefghijklmnopqrstuvwxyz"));
     System.out.println(check("abcdefghijklmnopqrstuvwxya"));
     System.out.println(check("The quick brown fox jumps over the lazy dog"));
	}

}
