package com.bridgelabz.structuraldesignpattern.facade;

public class FacadeClient {
	public static void main(String[] args) {
		System.out.println("========= Mobile Shop ============");
		ShopKeeper shopKeeper = new ShopKeeper();
		System.out.println("IPhone Sale");
		shopKeeper.iPhoneSale();
		System.out.println("Samsung Sale");
		shopKeeper.samsungSale();
		System.out.println("Nokia Sale");
		shopKeeper.nokiaSale();
			
	}
}
