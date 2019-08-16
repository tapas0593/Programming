package com.bridgelabz.structuraldesignpattern.facade;

public class Samsung implements MobileShop {
	@Override
	public void getModelNo() {
		System.out.println("Samsung Galaxy Note 7");
	}

	@Override
	public void getPrice() {
		System.out.println("55000");
	}

}
