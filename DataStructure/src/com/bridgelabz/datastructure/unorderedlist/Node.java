package com.bridgelabz.datastructure.unorderedlist;

public class Node<E> {
	public Node<E> nextNode;
	public E data;

	Node(E data) {
		this.data = data;
		this.nextNode = null;

	}
}