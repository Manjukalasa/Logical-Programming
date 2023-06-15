package com.java.exam;
import java.util.*;
public class Alaram
{
	public static String alarmClock(int day, boolean vacation)
	{
		   if (vacation==false && day >=1 && day <= 5) 
		   {
		      return "7:00";
		   }
		   else if(vacation==false && (day ==0 || day == 6)) 
		    {
		      return "10:00";
		  }
		  else if (vacation==true && day >=1 && day <= 5) 
		 {
		   return "10:00";
		  }
		    else
		    {
		      return "off";
		}
}
	public static void main(String[] args) 
	{
     System.out.println("------------------Welcome To Coding Exam---------------------");
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter integer input");
     int day=sc.nextInt();
     System.out.println("Enter boolean input");
     boolean vacation=sc.nextBoolean();
     System.out.println("Output is="+alarmClock( day, vacation));
     sc.close(); 
	}

}
