package com.bridgelabz.behavioraldesignpattern.mediator;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Tapas");
		User user2 = new UserImpl(mediator, "Ashok");
		User user3 = new UserImpl(mediator, "Aastha");
		User user4 = new UserImpl(mediator, "Manoj");
		User user5 = new UserImpl(mediator, "Sukesh");

		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		mediator.addUser(user5);

		user1.sendMessage("Hello Team... ");
		user3.sendMessage("Hello ");

	}

}
