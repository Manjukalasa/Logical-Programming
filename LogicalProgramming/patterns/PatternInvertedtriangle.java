/*
    *
   **
  ***
 ****
*****
 */
package com.java.patterns;
public class PatternInvertedtriangle 
{
    public static void main(String[] args) {
        int i=1,n=5;
         while(i<=n)
         {
            int j=1;
            while(j<=(n-i))
            {
            System.out.print(" ");
            j++;
         }
         while(j<=n)
         {
         System.out.print("*");
         j++;
        }
        System.out.println("");
        i++;    
      }
   }  
}
