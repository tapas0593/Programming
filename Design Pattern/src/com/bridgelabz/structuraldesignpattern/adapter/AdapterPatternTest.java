package com.bridgelabz.structuraldesignpattern.adapter;

public class AdapterPatternTest {
	public static void main(String[] args) {
		testSocketClassAdapter();
		testSocketObjectAdapter();
	}

	private static void testSocketClassAdapter() {
		SocketAdapter socketAdapter = new SocketClassAdapterImpl();
		Volt v120 = socketAdapter.get120Volt();
		Volt v12 = socketAdapter.get12Volt();
		Volt v3 = socketAdapter.get3Volt();
		System.out.println("120 V using Class Adapter: " + v120.getVolts() + " Volts");
		System.out.println("12 V using Class Adapter: " + v12.getVolts() + " Volts");
		System.out.println("3 V using Class Adapter: " + v3.getVolts() + " Volts");

	}

	private static void testSocketObjectAdapter() {
		SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
		Volt v120 = socketAdapter.get120Volt();
		Volt v12 = socketAdapter.get12Volt();
		Volt v3 = socketAdapter.get3Volt();
		System.out.println("120 V using Object Adapter: " + v120.getVolts() + " Volts");
		System.out.println("12 V using Object Adapter: " + v12.getVolts() + " Volts");
		System.out.println("3 V using Object Adapter: " + v3.getVolts() + " Volts");

	}
}
