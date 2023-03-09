package com.java.patterns;

public class Nestedloop5 {
    public static void main(String[] args)
    {
     char n='A';
     for(char i='C';i>=n;i--) 
     {
       for(char j='C';j>=n;j--)
       {
         System.out.print(i +" ");
       } 
       System.out.println();
     }  
   }

}
