/*
 
*********
 *******
  *****
   ***
    *
            */
package com.java.patterns;
public class Pattern5b {
    public static void main(String[] args)
    {
        int n=5,max=n*2-1;
     for(int i=5;i>=1;i--)
       {
        for(int k=n-1;k>=i;k--)
        {
            System.out.print(" ");
        }
        
        for(int j=1;j<=max;j++)
        {
            System.out.print("*");
        }
        max=max-2;
        System.out.println();
       }
    }
}
