package com.bridgelabz.behavioraldesignpattern.visitor;

public interface ItemElement {

	int accept(ShoppingCartVisitor visitor);
}
