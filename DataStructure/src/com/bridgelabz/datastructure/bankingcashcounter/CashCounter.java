package com.bridgelabz.datastructure.bankingcashcounter;

public class CashCounter {
	long balance = 100000L;

	public void deposit(double amount) {
		System.out.println("Rs." + amount + " deposited successfully..!!");
		balance += amount;
		System.out.println("Cash Balance: " + balance);
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			System.out.println("Rs." + amount + " withdrawn successfully..!!");
			balance -= amount;
			System.out.println("Cash balance: " + balance);
		}
		else {
			System.out.println("Insufficient balance. Total balance is "+balance);
		}
	}

}
