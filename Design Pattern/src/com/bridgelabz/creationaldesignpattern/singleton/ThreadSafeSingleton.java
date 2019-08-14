package com.bridgelabz.creationaldesignpattern.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	/*
	 * make the global access method synchronized, so that only one thread can
	 * execute this method at a time.
	 */
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	/*
	 * CONS: getInstance() method is synchronized so it causes slow performance as
	 * multiple threads can’t access it simultaneously.
	 */

	public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
