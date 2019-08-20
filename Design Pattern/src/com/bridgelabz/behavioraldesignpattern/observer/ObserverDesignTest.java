package com.bridgelabz.behavioraldesignpattern.observer;

public class ObserverDesignTest {
	public static void main(String[] args) {
		Subject topic = new MyTopic();
		MyTopicSubscriber ob1 = new MyTopicSubscriber("Tapas");
		MyTopicSubscriber ob2 = new MyTopicSubscriber("Akshay");
		MyTopicSubscriber ob3 = new MyTopicSubscriber("Anand");
		MyTopicSubscriber ob4 = new MyTopicSubscriber("Kishan");

		topic.register(ob1);
		topic.register(ob2);
		topic.register(ob3);
		topic.register(ob4);

		ob1.registeredTopic(topic);
		ob2.registeredTopic(topic);
		ob3.registeredTopic(topic);
		ob4.registeredTopic(topic);
		
		topic.update("New Topic");
	}
}
