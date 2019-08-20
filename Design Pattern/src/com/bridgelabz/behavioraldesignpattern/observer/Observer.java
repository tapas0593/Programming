package com.bridgelabz.behavioraldesignpattern.observer;

public interface Observer {

	void update();

	void registeredTopic(Subject topic);

}