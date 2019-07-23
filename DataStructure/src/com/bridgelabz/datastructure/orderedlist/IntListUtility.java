package com.bridgelabz.datastructure.orderedlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IntListUtility {
	public int[] readIntFile() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("/home/admin237/Desktop/MY_WS/DataStructure Programs/src/IntFile"));
		String num;
		String ints = "";
		while ((num = br.readLine()) != null) {
			ints = ints + num;
		}
		System.out.println(ints);
		ints = ints.replaceAll("\\s+", " ");
		ints = ints.trim();
		String[] numArray = ints.split(" ");
		int[] intArray = new int[numArray.length];
		for (int i = 0; i < numArray.length; i++) {
			intArray[i] = Integer.parseInt(numArray[i]);
		}
		br.close();
		return intArray;
	}

	public void sort(int[] intArray) {
		for (int i = 0; i < intArray.length - 1; i++) {
			boolean swap = false;
			for (int j = 0; j < intArray.length - 1 - i; j++) {
				if (intArray[j] > intArray[j + 1]) {
					int t = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = t;
					swap = true;
				}
			}
			if (swap == false)
				break;
		}
	}

	public void writeToFile(Node head) throws IOException {
		FileWriter fw = new FileWriter("/home/admin237/Desktop/MY_WS/DataStructure Programs/src/IntFile.txt");
		String string = "";
		while (head != null) {
			string += head.data + " ";
			head = head.nextNode;
		}
		fw.write(string);
		fw.close();
	}

}
