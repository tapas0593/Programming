package com.bridgelabz.addressbook.serviceimplementation;

import java.io.FileReader; 
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.addressbook.addressbookmodel.AddressBook;
import com.bridgelabz.addressbook.addressbookservice.Book;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AddressBookService implements Book {
	JSONParser parser = new JSONParser();
	ArrayList<AddressBook> list = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	public AddressBookService() {
		try {
			FileReader fr = new FileReader("/home/admin237/Desktop/MY_WS/Address Book/src/AddressBook.json");
			JSONArray array = (JSONArray) parser.parse(fr);

			for (Object obj : array) {
				AddressBook employee = new AddressBook();

				JSONObject address = (JSONObject) obj;
				employee.setFirstName((String) address.get("firstName"));
				employee.setLastName((String) address.get("lastName"));
				employee.setHouseNumber((String) address.get("houseNumber"));
				employee.setStreet((String) address.get("street"));
				employee.setCity((String) address.get("city"));
				employee.setState((String) address.get("state"));
				employee.setPincode(((Number) address.get("pincode")).intValue());
				employee.setPhoneNum(((Number) address.get("phoneNum")).longValue());
				list.add(employee);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editAddress() {
		AddressBook editData = editData();
		for (int i = 0; i < list.size(); i++) {
			AddressBook employee = list.get(i);
			if (employee.getFirstName().equalsIgnoreCase(editData.getFirstName())
					&& employee.getLastName().equalsIgnoreCase(editData.getLastName())) {
				if (editData.getHouseNumber() != null) {
					employee.setHouseNumber(editData.getHouseNumber());
				}
				if (editData.getStreet() != null) {
					employee.setStreet(editData.getStreet());
				}
				if (editData.getCity() != null) {
					employee.setCity(editData.getCity());
				}
				if (editData.getState() != null) {
					employee.setState(editData.getState());
				}
				if (editData.getPincode() != 0) {
					employee.setPincode(editData.getPincode());
				}
				if (editData.getPhoneNum() != 0) {
					employee.setPhoneNum(editData.getPhoneNum());
				}
				list.set(i, employee);
			}
		}
		writeToFile();
		display();
	}

	public AddressBook editData() {
		AddressBook employee = new AddressBook();
		System.out.println("Enter the full name of the employee, for which you wish to change the address");
		employee.setFirstName(sc.next());
		employee.setLastName(sc.next());
		boolean continues = true;
		while (continues) {
			System.out.println("What do you wish to edit...?");
			System.out.println("\n1. House number.\n2. Street name.\n3. City.\n4. State."
					+ "\n5. Pincode.\n6. Phone Number.\n7. Done");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter the House Number:");
				employee.setHouseNumber(sc.next());
				break;
			case 2:
				System.out.println("Enter the Street Name:");
				employee.setStreet(sc.next());
				break;
			case 3:
				System.out.println("Enter the City:");
				employee.setCity(sc.next());
				break;
			case 4:
				System.out.println("Enter the State:");
				employee.setState(sc.next());
				break;
			case 5:
				System.out.println("Enter the pincode:");
				employee.setPincode(sc.nextInt());
				break;
			case 6:
				System.out.println("Enter the Phone number:");
				employee.setPhoneNum(sc.nextLong());
				break;
			case 7:
				continues = false;
				break;
			default:
				System.out.println("Invalid input.");
			}
		}
		return employee;
	}

	@Override
	public void deleteAddress() {
		System.out.println("Enter the First name and Last name of the employee");
		String firstName = sc.next();
		String lastName = sc.next();
		boolean found = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getFirstName().equalsIgnoreCase(firstName)
					&& list.get(i).getLastName().equalsIgnoreCase(lastName)) {
				list.remove(i);
				found = true;
			}
		}
		if (!found)
			System.out.println("Employee Not found");
		writeToFile();
		display();
	}

	@Override
	public void addAddress() {
		AddressBook employee = new AddressBook();
		System.out.println("Please enter the first name of the Employee");
		employee.setFirstName(sc.next());
		System.out.println("Please enter the last name of the employee");
		employee.setLastName(sc.next());
		System.out.println("Please enter the House Number");
		employee.setHouseNumber(sc.next());
		System.out.println("Please enter the street name");
		employee.setStreet(sc.next());
		System.out.println("Please enter the city");
		employee.setCity(sc.next());
		System.out.println("Enter the State");
		employee.setState(sc.next());
		System.out.println("Enter the Pin Code");
		employee.setPincode(sc.nextInt());
		System.out.println("Enter the Phone number");
		employee.setPhoneNum(sc.nextLong());
		list.add(employee);
		writeToFile();
		display();
	}

	@Override
	public void sortByName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sortByPin() {
		// TODO Auto-generated method stub

	}

	public void display() {
		for (AddressBook emp : list) {
			System.out.println(emp.getFirstName() + " " + emp.getLastName());
			System.out.println(emp.getHouseNumber() + ", " + emp.getStreet());
			System.out.println(emp.getCity() + ", " + emp.getState() + ", " + emp.getPincode());
			System.out.println(emp.getPhoneNum());
			System.out.println();
		}
	}

	public void writeToFile() {
		GsonBuilder build = new GsonBuilder();
		build.setPrettyPrinting();
		Gson gson = build.create();
		try {
			FileWriter writer = new FileWriter("/home/admin237/Desktop/MY_WS/Address Book/src/AddressBook.json");
			writer.write(gson.toJson(list));
			writer.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
