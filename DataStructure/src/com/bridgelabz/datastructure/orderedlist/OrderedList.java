package com.bridgelabz.datastructure.orderedlist;

import java.util.Scanner;

public class OrderedList {
	static Node head;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		IntListUtility ilu = new IntListUtility();
		int[] intArray = ilu.readIntFile();
		ilu.sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			add(intArray[i]);
		}
		System.out.println("The Ordered List is ");
		printList(head);
		System.out.println("Enter the number you want to search");
		int number = sc.nextInt();
		boolean isPresent = search(number);
		Node newHead = null;
		if (isPresent) {
			System.out.println("The number " + number + " was found and was deleted from the list");
			remove(number);
			printList(head);
			ilu.writeToFile(head);
		} else {
			System.out.println("The number " + number + " was not found and was added to the list");
			newHead = addtoList(number);
			printList(newHead);
			ilu.writeToFile(newHead);
		}
	}

	public static void remove(int number) {
		Node currNode = head;
		Node prevNode = null;
		if (currNode != null && (int) currNode.data == number)
			head = currNode.nextNode;
		else {
			while (currNode != null && (int) currNode.data != number) {
				prevNode = currNode;
				currNode = currNode.nextNode;
			}
			if (currNode != null) {
				prevNode.nextNode = currNode.nextNode;
			}
		}
	}

	public static Node addtoList(int number) {
		Node newNode = new Node(number);
		Node currNode = head;
		if ((int) newNode.data < (int) currNode.data) {
			newNode.nextNode = head;
			return newNode;
		} else {
			Node prevNode = null;
			while (currNode != null && (int) newNode.data > (int) currNode.data) {
				prevNode = currNode;
				currNode = currNode.nextNode;
			}
			if (currNode != null) {
				prevNode.nextNode = newNode;
				newNode.nextNode = currNode;
			} else {
				prevNode.nextNode = newNode;
			}
			return head;

		}
	}

	public int size() {
		int size = 0;
		while (head != null) {
			size++;
			head = head.nextNode;
		}
		return size;
	}

	public static void add(int data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			Node tail = head;
			while (tail.nextNode != null) {
				tail = tail.nextNode;
			}
			tail.nextNode = newNode;
		}

	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.nextNode;
		}
		System.out.println();
	}

	public static boolean search(int number) {
		Node currNode = head;
		while (currNode != null && (int) currNode.data != number) {
			currNode = currNode.nextNode;
		}
		if (currNode != null)
			return true;
		else
			return false;
	}
}
