package com.bridgelabz.datastructure.unorderedlist;

public class Node<E> {
	Node nextNode;
	E data;

	Node(E data) {
		this.data = data;
		this.nextNode = null;
	}

}
