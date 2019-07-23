package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class SortAndSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for performing Binary Search for Integer");
		System.out.println("Enter 2 for performing Binary Search for String");
		System.out.println("Enter 3 for performing Insersion Sort for Integer");
		System.out.println("Enter 4 for performing Insersion sort for String");
		System.out.println("Enter 5 for performing Bubble Sort for Integer");
		System.out.println("Enter 6 for performing Bubble sort for String");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			int a[] = Util.readArray();
			System.out.println("Enter the elements you wish to search");
			int x = sc.nextInt();
			int res1 = Util.binarySearch(a, x);
			if (res1 == -1)
				System.out.println("The element is not present");
			else
				System.out.println("The element " + x + " is present in " + res1 + " index position");
			break;
		case 2:
			String s1[] = Util.readStringArray();
			System.out.println("Enter the the string to search");
			String s2 = sc.next();
			int res2 = Util.binarySearch(s1, s2);
			if (res2 == -1)
				System.out.println("The string is not present");
			else
				System.out.println("The string " + s2 + " is present in the " + res2 + " index position");
			break;
		case 3:
			int b[] = Util.readArray();
			Util.insertionSort(b);
			System.out.println("The sorted array is");
			Util.dispArray(b);
			break;
		case 4:
			String s3[] = Util.readStringArray();
			Util.insertionSort(s3);
			System.out.println("The sorted String array is");
			Util.dispArray(s3);
			break;
		case 5:
			int[] arr = Util.readArray();
			Util.bubbleSort(arr);
			System.out.println("The sorted array is");
			Util.dispArray(arr);
			break;
		case 6:
			String[] str = Util.readStringArray();
			Util.bubbleSort(str);
			System.out.println("The sorted String array is");
			Util.dispArray(str);
			break;
		default:
			System.out.println("Invalid input");
		}
		sc.close();
	}

}
