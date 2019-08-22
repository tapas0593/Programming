package com.bridgelabz.behavioraldesignpattern.visitor;

public class ShoppingCartClient {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Book(100, "RD Sharma"), new Book(40, "India Today"),
				new Fruit(50, 2, "Apple"), new Fruit(20, 2, "Banana") };
		int total = calculateTotal(items);
		System.out.println("Total Cart price: " + total);

	}

	private static int calculateTotal(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum += item.accept(visitor);
		}
		return sum;
	}

}
