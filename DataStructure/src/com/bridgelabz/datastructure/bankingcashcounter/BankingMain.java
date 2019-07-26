package com.bridgelabz.datastructure.bankingcashcounter;

import java.util.Scanner;

public class BankingMain {
	static Scanner sc = new Scanner(System.in);
	static Queue<Integer> queue = new Queue<>();

	public static void main(String[] args) {
		CashCounter counter = new CashCounter();
		System.out.println("Enter the number of people in the queue");
		int numOfPeople = sc.nextInt();
		for (int i = 1; i <= numOfPeople; i++) {
			queue.enqueue(i);
		}
		System.out.println("--Banking Cash Counter--");
		int temp = numOfPeople;
		while (temp != 0) {
			System.out.println("People in Queue:");
			queue.display();
			System.out.println("Enter 1 for adding more people in the queue");
			System.out.println("Enter 2. to Deposit money");
			System.out.println("Enter 3. to Withdraw money");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				numOfPeople = addMorePeople(numOfPeople);
				temp = numOfPeople;
				break;
			case 2:
				System.out.println("Enter the amount you want to deposit");
				counter.deposit(sc.nextDouble());
				queue.dequeue();
				temp--;
				if (temp == 0) {
					if (wantToAdd())
						numOfPeople = addMorePeople(numOfPeople);
				}
				break;
			case 3:
				System.out.println("Enter the amount you want to withdraw");
				counter.withdraw(sc.nextDouble());
				queue.dequeue();
				temp--;
				if (temp == 0) {
					if (wantToAdd())
						numOfPeople = addMorePeople(numOfPeople);
				}
				break;
			default:
				System.out.println("Invalid input.. try again!!");
			}
		}
	}

	static int addMorePeople(int numOfPeople) {
		System.out.println("How many more people");
		int morePeople = sc.nextInt();
		for (int i = numOfPeople + 1; i <= (numOfPeople + morePeople); i++) {
			queue.enqueue(i);
		}
		numOfPeople += morePeople;
		return numOfPeople;
	}

	static boolean wantToAdd() {
		while (true) {
			System.out.println("Are there more people in the queue..? Y/n");
			char choice = sc.next().charAt(0);
			if (choice == 'Y' || choice == 'y')
				return true;
			else if (choice == 'N' || choice == 'n')
				return false;
			else
				System.out.println("Invalid choice..");
		}

	}

}
