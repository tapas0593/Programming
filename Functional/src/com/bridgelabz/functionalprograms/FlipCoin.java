package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times you are flipping the coin");
		int n = sc.nextInt();
		int heads = 0, tails = 0, i = 1;
		if (n > 0) {
			while (i <= n) {
				double value = Math.random();
				if (value < 0.5) {
					System.out.println(value + " Tails");
					tails++;
				} else {
					System.out.println(value + " Heads");
					heads++;
				}
				i++;
			}
			System.out.println("Head Percentage vs Win Percentage");
			System.out.println((double) heads * 100 / n + " vs " + (double) tails * 100 / n);
		} else {
			System.out.println("The number of flips should be a positive number");
		}
	}

}
