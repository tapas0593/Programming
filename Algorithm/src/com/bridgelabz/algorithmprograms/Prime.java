package com.bridgelabz.algorithmprograms;

public class Prime {
	public static void main(String[] args) {
		for (int i = 3; i <= 1000; i++) {
			if (Util.isPrime(i))
				System.out.print(i + " ");
		}

	}

}
