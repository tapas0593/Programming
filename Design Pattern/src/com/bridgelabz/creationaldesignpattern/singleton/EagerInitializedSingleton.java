package com.bridgelabz.creationaldesignpattern.singleton;

/*
* 1. Private constructor to restrict instantiation of the class from other classes.
* 2. Private static variable of the same class that is the only instance of the class.
* 3. Public static method that returns the instance of the class,
* this is the global access point for outer world to get the instance of the singleton class.
*/
public class EagerInitializedSingleton {

	/*
	 * the instance of Singleton Class is created at the time of class loading.
	 * Drawback:instance is created even though client application might not be
	 * using it.
	 */

	// Private static variable of the same class that is the only instance of the
	// class.
	private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	// Public static method that returns the instance of the class,
	public static EagerInitializedSingleton getInstance() {
		return INSTANCE;
	}

}
