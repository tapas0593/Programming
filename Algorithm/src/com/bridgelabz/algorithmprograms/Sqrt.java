package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double c = sc.nextDouble();
		double t = sqrt(c);
		System.out.println("The square root of " + c + " using Newton's Method is= " + t);
	}

	static double sqrt(double c) {
		double epsilon = 1e-15;
		double t = c;
		while (Math.abs(t - c / t) > epsilon * t)
			t = (c / t + t) / 2;
		return t;
	}

}
