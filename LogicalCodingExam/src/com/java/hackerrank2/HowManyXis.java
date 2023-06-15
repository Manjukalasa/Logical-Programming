package com.java.hackerrank2;
import java.util.*;
public class HowManyXis
{
    public static int range(int n,int d,int key)
    {
    		int count=0;		
    		for(int i=n;i<=d;i++)
         	{
    		if(i%10==key && i/10==key)   
    		{
    			count++;
    		}
    		if(i%10==key|| i/10==key)
    		{
    			 count++;
    		}
    	}
        return count;
    }
 public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int d=s1.nextInt();
        int key=s1.nextInt();  //f=10 s=19 key(x)=1-->11  // 18 81 9-->7 // 1000 1030 8--->3
        System.out.println(range(n,d,key));
        s1.close();
    }
}