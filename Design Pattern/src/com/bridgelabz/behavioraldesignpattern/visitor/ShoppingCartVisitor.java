package com.bridgelabz.behavioraldesignpattern.visitor;

public interface ShoppingCartVisitor {

	int visit(Book book);

	int visit(Fruit fruit);

}
