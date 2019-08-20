package com.bridgelabz.behavioraldesignpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	private List<MyTopicSubscriber> observers = new ArrayList<>();
	private String message;

	@Override
	public void register(MyTopicSubscriber observer) {
		observers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public void update(String message) {
		this.message = message;
		notifyObservers();
	}

	@Override
	public String getMessage() {
		return message;
	}
}
