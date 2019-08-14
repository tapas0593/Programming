package com.bridgelabz.creationaldesignpattern.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
	private SerializedSingleton() {
	}

	private static final SerializedSingleton INSTANCE = new SerializedSingleton();

	public static SerializedSingleton getInstance() {
		return INSTANCE;
	}

	/*
	 * To overcome this issue, we have to implement method readResolve() method.
	 */
	protected Object readResolve() {
		return getInstance();
	}

}
