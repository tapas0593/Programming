package com.bridgelabz.datastructure.orderedlist;

import java.io.*;

public class ListUtility {
	public Node readFile(Node head) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("DemoFile.txt"));
		String words = "";
		String word;
		while ((word = br.readLine()) != null) {
			words = words + word + " ";
		}
		String[] wordsArray = words.split(" ");
		for (int i = 0; i < wordsArray.length; i++) {
			head = insert(head, wordsArray[i]);
		}

		br.close();
		return head;
	}

	public Node insert(Node head, String data) {
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
		return head;
	}

	public void printList(Node head) {
		Node tail = head;
		System.out.println("The linked list: ");
		while (tail != null) {
			System.out.print(tail.data + " ");
			tail = tail.nextNode;
		}
		System.out.println();
	}

	public Node search(Node head, String word) {
		Node prevNode = null;
		Node currNode = head;
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
				insert(head, word);
				return head;
			}
		}
	}

	public void writeToFile(String word1) throws IOException {
		FileWriter fw = new FileWriter("DemoFile1.txt");
		fw.write(word1);
		fw.close();
	}
}
