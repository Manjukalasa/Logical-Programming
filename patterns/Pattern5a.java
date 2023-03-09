/*
    *
   ***
  *****
 *******
*********
            */
package com.java.patterns;

public class Pattern5a {
    public static void main(String[] args)
    {
        int n=5,min=1;
     for(int i=1;i<=n;i++)
       {
        for(int k=n-1;k>=i;k--)
        {
            System.out.print(" ");
        }
        
        for(int j=1;j<=min;j++)
        {
            System.out.print("*");
        }
        min=min+2;
        System.out.println();
       }

    } 
}
