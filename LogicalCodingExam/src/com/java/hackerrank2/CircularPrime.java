package com.java.hackerrank2;
import java.util.*;
public class CircularPrime
{
    public static int check(int num)
      {
        int a=num;
        int c1=0;
        int temp=1;
        while(a!=0)
        {
         c1++;
         temp=temp*10;
         a=a/10;
        }
      int c=0;
      int c2=0;
      while(num!=0)
      {
        if(c2<c1)
        {
          for(int i=2;i<num;i++)
          {
              if(num%i==0)
              {
                  c++;
              }
          }
          int rem=num%10;
          num=num/10;
          num=rem*(temp/10)+num;
        }
        else
        {
            num=0;
        }
        c2++;
      }
      if(c==0)
      {
        return 1;
      }
      else
      {
          return 0;  
      }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(check(num));
        sc.close();
        
    }
}