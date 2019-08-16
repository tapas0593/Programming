package com.bridgelabz.structuraldesignpattern.facade;

public class ShopKeeper {
	private MobileShop iPhone;
	private MobileShop samsung;
	private MobileShop nokia;

	public ShopKeeper() {
		iPhone = new IPhone();
		samsung = new Samsung();
		nokia = new Nokia();
	}

	public void iPhoneSale() {
		iPhone.getModelNo();
		iPhone.getPrice();
	}

	public void samsungSale() {
		samsung.getModelNo();
		samsung.getPrice();
	}

	public void nokiaSale() {
		nokia.getModelNo();
		nokia.getPrice();
	}
}
