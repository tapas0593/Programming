package com.bridgelabz.structuraldesignpattern.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

	Socket socket = new Socket();

	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt volt = socket.getVolt();
		return convertVolt(volt, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt volt = socket.getVolt();
		return convertVolt(volt, 40);
	}

	private Volt convertVolt(Volt volt, int unit) {
		return new Volt(volt.getVolts() / unit);
	}
}
