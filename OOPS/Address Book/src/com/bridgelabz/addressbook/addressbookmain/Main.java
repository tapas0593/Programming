package com.bridgelabz.addressbook.addressbookmain;

import java.util.Scanner;

import com.bridgelabz.addressbook.addressbookservice.Book;
import com.bridgelabz.addressbook.serviceimplementation.AddressBookService;

public class Main {

	public static void main(String[] args) {
		Book service = new AddressBookService();

		Scanner sc = new Scanner(System.in);

		boolean continues = true;
		do {
			System.out.println("<Address Book>");
			System.out.println("1. Add a new Address");
			System.out.println("2. Edit an existing Address");
			System.out.println("3. Delete an existing Address");
			System.out.println("4. Sort By name");
			System.out.println("5. Sort by pincode");
			System.out.println("6, Done");
			switch (sc.nextInt()) {
			case 1:
				service.addAddress();
				break;
			case 2:
				service.editAddress();
				break;
			case 3:
				service.deleteAddress();
				break;
			case 4:
				service.sortByName();
				break;
			case 5:
				service.sortByPin();
				break;
			case 6:
				System.out.println("Bye..!!");
				continues = false;
				break;
			default:
				System.out.println("Invalid entry");
			}
		} while (continues);

	}

}
