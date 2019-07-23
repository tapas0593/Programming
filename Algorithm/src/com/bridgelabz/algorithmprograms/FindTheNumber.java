package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class FindTheNumber {
	int count;

	public static void main(String[] args) {
		FindTheNumber f = new FindTheNumber();
		int n = Integer.parseInt(args[0]);
		System.out.println("Think of any number between 0 to " + (n - 1));
		int num = f.guessTheNumber(0, n - 1);
		if (num != -1) {
			System.out.println(num + " is the number");
			System.out.println("Found with " + f.count + " questions");
		} else
			System.out.println("Number not found");
	}

	int guessTheNumber(int start, int end) {
		Scanner sc = new Scanner(System.in);
		int mid = (start + end) / 2;
		System.out.println("Is your number between " + start + " and " + mid + " enter (Y/y) or (N/n)");
		count++;
		char select = sc.next().charAt(0);
		if (start == end)
			return start;
		if (select == 'Y' || select == 'y')
			return guessTheNumber(start, mid);
		if (select == 'N' || select == 'n')
			return guessTheNumber(mid + 1, end);
		return -1;
	}
}
