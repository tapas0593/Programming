package com.bridgelabz.structuraldesignpattern.facade;

public class Nokia implements MobileShop {
	@Override
	public void getModelNo() {
		System.out.println("Lumia 10");
	}

	@Override
	public void getPrice() {
		System.out.println("35000");
	}

}
