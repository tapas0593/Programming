package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n = sc.nextInt();
		if (n == 0)
			System.out.println("Invalid input");
		else {
			double h = nthHarmonic(n);
			System.out.println("The nTh Harmonic value is=" + h);
		}
	}

	static double nthHarmonic(int n) {
		double sum = 1;
		for (int i = 2; i <= n; i++)
			sum = sum + (double) 1 / i;
		return sum;
	}

}
