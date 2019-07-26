package com.bridgelabz.datastructure.unorderedlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class LinkedList<E> {
	public Node<E> head;

	public Node<E> readFile() {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("/home/admin237/Desktop/MY_WS/DataStructure/src/DemoFile.txt"));
			String words = "";
			String word;
			while ((word = br.readLine()) != null) {
				words = words + word + " ";
			}
			String[] wordsArray = words.split(" ");
			for (int i = 0; i < wordsArray.length; i++) {
				head = add((E) wordsArray[i]);
			}

			br.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return head;
	}

	public Node<E> add(E data) {
		Node<E> newNode = new Node<>(data);

		if (head == null)
			head = newNode;
		else {
			Node<E> tail = head;
			while (tail.nextNode != null) {
				tail = tail.nextNode;
			}
			tail.nextNode = newNode;
		}
		return head;
	}

	public Node<E> search(E word) {
		Node<E> prevNode = null;
		Node<E> currNode = head;
		if (currNode != null && (currNode.data).equals(word)) {
			head = currNode.nextNode;
			System.out.println("Word found and deleted from the list");
			return head;
		}

		else {
			while (currNode != null && !(currNode.data).equals(word)) {
				prevNode = currNode;
				currNode = currNode.nextNode;
			}
			if (currNode != null) {
				prevNode.nextNode = currNode.nextNode;
				System.out.println("Word found and deleted from the list");
				return head;
			} else {
				System.out.println("Word not found, and it is added to the list");
				add(word);
				return head;
			}
		}
	}

	public void writeToFile() {
		try {
			FileWriter fw = new FileWriter("/home/admin237/Desktop/MY_WS/DataStructure/src/DemoFile.txt");
			Node<E> temp = head;
			String line = "";
			while (temp != null) {
				line += temp.data + " ";
				temp = temp.nextNode;
			}
			fw.write(line);
			fw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void printList() {
		Node<E> tail = head;
		System.out.println("The linked list: ");
		while (tail != null) {
			System.out.print(tail.data + " ");
			tail = tail.nextNode;
		}
		System.out.println();
	}
	public int size() {
		Node<E> currNode=head;
		int size=0;
		while(currNode!=null) {
			size++;
			currNode=currNode.nextNode;
		}
		return size;
	}
}
