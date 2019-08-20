package com.bridgelabz.behavioraldesignpattern.observer;

public class MyTopicSubscriber implements Observer {
	private String name;
	private Subject channel = new MyTopic();

	public MyTopicSubscriber(String name) {
		this.name = name;
	}
	@Override
	public void update() {
		System.out.println("Hey " +name+ ", Video uploaded. Topic: "+channel.getMessage());
	}

	@Override
	public void registeredTopic(Subject topic) {
		channel = topic;
	}
}
