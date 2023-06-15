package com.java.mybasicprograms25;


public class ReversNumber {
        public static void main(String[] args) {
            int num = 1234;
    
            // Logic 1 - Using Algorithm
            int rev = 0;
            while (num != 0) 
            {
                rev = rev * 10 + num % 10;
                num = num / 10;
                // 0+1234%10=4  40+3=43    430+2=432  4320+1=4321
                // 1234/10=123  123/10=12  12/10=1    1/10=0
            }
            System.out.println("Reverse Number: " + rev);
        }
}
