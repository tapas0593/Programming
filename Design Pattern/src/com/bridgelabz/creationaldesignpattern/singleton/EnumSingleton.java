package com.bridgelabz.creationaldesignpattern.singleton;

public enum EnumSingleton {

	INSTANCE;

	public static void doSomething() {
		// do something
	}
}
/*
 * As enums don’t have any constructor so it is not possible for Reflection to
 * utilize it. Enums have their by-default constructor, we can’t invoke them by
 * ourself. JVM handles the creation and invocation of enum constructors
 * internally.
 * 
 * java ensures internally that enum value is instantiated only once.
 * 
 * Its only drawback is that it is not flexible i.e it does not allow lazy
 * initialization.
 */