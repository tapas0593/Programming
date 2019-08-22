package com.bridgelabz.behavioraldesignpattern.mediator;

public class UserImpl implements User {
	private String name;
	private ChatMediator med;

	public UserImpl(ChatMediator med, String name) {
		this.med = med;
		this.name = name;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(this.name + " sending message: " + message);
		med.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(this.name + " received message: " + message);
	}

}
