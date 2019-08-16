package com.bridgelabz.structuraldesignpattern.adapter;

public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}
