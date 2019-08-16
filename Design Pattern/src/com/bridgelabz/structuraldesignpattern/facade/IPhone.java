package com.bridgelabz.structuraldesignpattern.facade;

public class IPhone implements MobileShop {

	@Override
	public void getModelNo() {
		System.out.println("iPhone X");
	}

	@Override
	public void getPrice() {
		System.out.println("65000");
	}
	
}
