package com.bridgelabz.behavioraldesignpattern.observer;

public interface Subject {

	void register(MyTopicSubscriber observer);

	void unregister(Observer observer);

	void notifyObservers();

	void update(String message);

	String getMessage();

}