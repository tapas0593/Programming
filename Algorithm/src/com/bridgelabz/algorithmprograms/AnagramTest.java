package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class AnagramTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String s1 = sc.nextLine();
		System.out.println("Enter the 2nd string");
		String s2 = sc.nextLine();
		if (Util.isAnagram(s1, s2))
			System.out.println("They are Anagram");
		else
			System.out.println("They are not Anagram");
		sc.close();
	}

}
