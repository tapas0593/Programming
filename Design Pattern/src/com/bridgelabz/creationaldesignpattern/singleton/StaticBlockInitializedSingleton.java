package com.bridgelabz.creationaldesignpattern.singleton;

public class StaticBlockInitializedSingleton {
	/*
	 * Static block initialization implementation is similar to eager
	 * initialization, except that instance of class is created in the static block
	 * that provides option for exception handling.
	 */

	private static StaticBlockInitializedSingleton instance;
	static {
		try {
			instance = new StaticBlockInitializedSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception in creating a singleton instance.");
		}
	}

	public static StaticBlockInitializedSingleton getInstance() {
		return instance;
	}
}
