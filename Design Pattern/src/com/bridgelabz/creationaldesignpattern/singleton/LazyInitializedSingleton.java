package com.bridgelabz.creationaldesignpattern.singleton;

public class LazyInitializedSingleton {
	/*
	 * In this method, object is created only if it is needed.
	 */
	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null)
			return new LazyInitializedSingleton();
		else
			return instance;
	}
}
/*
 * It can be used in a single threaded environment because multiple threads can
 * break singleton property because they can access get instance method
 * simultaneously and create multiple objects.
 */