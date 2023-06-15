package com.java.mybasicprograms25;
public class ToFindDuplicateElementInArray {
    public static void main(String[] args) {

		String a[] = { "java", "C", "C++", "Python", "java","C" };

		// Logic 1
		boolean flag = false;
		for (int i = 0; i <=a.length-1; i++) {
			for (int j = i + 1; j <=a.length-1; j++) {
				if (a[i] == a[j]) {
					System.out.println("Found Duplicate Element is " + a[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Duplicate Element Not Found");
		}
	}

}
