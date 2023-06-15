/*
   * 
  *** 
 ***** 
******* 
 */
package com.java.patterns;

public class PatternPyramid 
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
            int k=1;
            while(k<=(2*i-1))
            {
             System.out.print("*");
             k++;
         }
   
         System.out.println(" ");
         i++;
        }
     }   
}
