package com.bridgelabz.creationaldesignpattern.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {
	}

	// concept of inner static classes to use for singleton.
	/*
	 * When the singleton class is loaded, SingletonHelper class is not loaded into
	 * memory and only when someone calls the getInstance method, this class gets
	 * loaded and creates the Singleton class instance.
	 */
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
