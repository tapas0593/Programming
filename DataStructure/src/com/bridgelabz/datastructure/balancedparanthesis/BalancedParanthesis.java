package com.bridgelabz.datastructure.balancedparanthesis;

import java.util.Scanner;

public class BalancedParanthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the stack>");
		int size = sc.nextInt();
		Stack stack = new Stack(size);
		System.out.println("Enter the Arithmatic Expression...");
		String exp = sc.next();
		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (ch == '(')
				stack.push(i);
			else if (ch == ')') {
				int index = stack.pop();
				if (index == -1) {
					System.out.println("Unbalanced ')' at index " + i);
					break;
				} else
					System.out.println("')' at index " + i + " is balanced with '(' at index " + index);
			}
		}
		while (!stack.isEmpty()) {
			int index = stack.pop();
			System.out.println("Unbalanced '(' at index " + index);
		}
		sc.close();
	}

}
