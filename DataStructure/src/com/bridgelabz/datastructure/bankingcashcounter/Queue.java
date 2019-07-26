package com.bridgelabz.datastructure.bankingcashcounter;


public class Queue<T> {
	QNode<T> front;
	QNode<T> rear;

	public Queue() {
		this.front = null;
		this.rear = null;
	}

	public void enqueue(T data) {
		QNode<T> newNode = new QNode<>(data);
		if (rear == null) {
			rear = newNode;
			front = rear;
		} else {
			rear.next = newNode;
			rear = newNode;
		}

	}

	public T dequeue() {
		if (front == null) {
			System.out.println("Queue is Empty");
			return null;
		} else {
			QNode<T> temp = front;
			front = front.next;
			if (front == null) {
				rear = front;
			}
			return temp.data;
		}
	}

	public T peek() {
		if (front == null) {
			System.out.println("Queue is Empty");
			return null;
		}
		return front.data;
	}
	public int size() {
		QNode<T> temp=front;
		int size=0;
		while(temp!=null) {
			size++;
			temp=temp.next;
		}
			return size;
	}

	public void display() {
		QNode<T> temp = front;
		if (temp == null)
			System.out.println("Queue is Empty");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
