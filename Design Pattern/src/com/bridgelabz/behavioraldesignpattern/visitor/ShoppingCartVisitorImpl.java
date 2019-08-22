package com.bridgelabz.behavioraldesignpattern.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int cost = 0;
		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else {
			cost = book.getPrice();
		}
		System.out.println("Book ISBN Number: " + book.getIsbnNumber() + ". Price: " + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("Fruit: " + fruit.getName() + ". Price: " + cost);
		return cost;
	}

}
