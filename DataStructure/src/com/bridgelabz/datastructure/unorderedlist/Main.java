package com.bridgelabz.datastructure.unorderedlist;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> list=new LinkedList<String>();
		list.readFile();
		list.printList();
		System.out.println("Enter a  word to search");
		String searchWord=sc.next();
		list.search(searchWord);
		list.printList();
		list.writeToFile();
	}
}
