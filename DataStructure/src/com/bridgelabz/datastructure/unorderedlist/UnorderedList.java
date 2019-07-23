package com.bridgelabz.datastructure.unorderedlist;

import java.util.Scanner;

public class UnorderedList {
	static Node head;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ListUtility lu = new ListUtility();
		head = lu.readFile(head);
		lu.printList(head);
		System.out.println("Enter the word to find>");
		String word = sc.next();
		head = lu.search(head, word);
		lu.printList(head);
		String word1 = "";
		while (head != null) {
			word1 = word1 + head.data + " ";
			head = head.nextNode;
		}
		lu.writeToFile(word1);

	}

}
