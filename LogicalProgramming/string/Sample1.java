package com.java.string;

public class Sample1 
{
	@Override
  public int hashCode()
  {
	return 100;  
  }
	@Override
	  public String toString()
	  {
		return "hello";	  
	  }
	@Override
	public boolean equals(Object obj)
	  {
		return true;  
	  }
	public static void main(String[] args)
	{
	 Sample1 s1=new Sample1();
	 Sample1 s2=new Sample1();
	 System.out.println(s1.hashCode()); // exected onle override methods only
	 System.out.println(s1.toString());
	 System.out.println(s1);
	 System.out.println(s1.equals(s2));

	}

}
