package com.java.patterns;

public class Nestedloop3
{
    public static void main(String[] args)
    {
     char n='C';
     for(char i='A';i<=n;i++) 
     {
       for(char j='A';j<=n;j++)
       {
         System.out.print(i +" ");
       } 
       System.out.println();
     }  
   }
}
