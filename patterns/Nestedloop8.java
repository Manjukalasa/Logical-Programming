package com.java.patterns;
public class Nestedloop8
{
    public static void main(String[] args)
    {
     char count='A';   
     char n='C';
     for(char i='A';i<=n;i++) 
     {
       for(char j='A';j<=n;j++)
       {
         System.out.print(count +" ");
         count++;
       } 
       System.out.println();
     }  
   }
}
