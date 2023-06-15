package com.java.mybasicprograms25;

public class linerSharchingofElementInArray {
    public static void main(String[] args) {

		int a[] = { 10, 20, 40, 50, 30 };

		int search_element = 30; // int search_element = 50;
		boolean flag = false;

		for (int i = 0; i <=a.length-1; i++) {
			if (search_element == a[i]) {
				System.out.println("Element found at: " + a[i]);
				flag = true;
				break;
			}
		}
		 if (flag == false)

		{
			System.out.println("Element Not found");
		}
	}
}
