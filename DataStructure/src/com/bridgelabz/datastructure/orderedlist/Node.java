package com.bridgelabz.datastructure.orderedlist;

public class Node<E> {
	Node nextNode;
	E data;

	Node(E data) {
		this.data = data;
		this.nextNode = null;
	}

}
