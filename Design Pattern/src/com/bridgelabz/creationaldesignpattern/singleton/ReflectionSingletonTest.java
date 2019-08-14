package com.bridgelabz.creationaldesignpattern.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	public static void main(String[] args) {
		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
//		System.out.println(instance1); // @6bc7c054
		// Even if we try to call getInstance() twice, it gives one object
//		EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
//		System.out.println(instance2); //@6bc7c054

		EagerInitializedSingleton instance2 = null;
		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor cons : constructors) {
				// Below code will destroy the singleton pattern
				cons.setAccessible(true);
				instance2 = (EagerInitializedSingleton) cons.newInstance();
				break;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(instance1);
		System.out.println(instance2);

	}
}
