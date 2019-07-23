package com.bridgelabz.addressbook.addressbookmodel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddressBook {
	private String firstName;
	private String lastName;
	private String houseNumber;
	private String street;
	private String city;
	private String state;
	private int pincode;
	private long phoneNum;

	public String toString() {
		return this.firstName + " " + this.lastName + "\n" + this.houseNumber + ", " + this.street + "\n" + this.city
				+ ", " + this.state + ", " + this.pincode + "\n" + this.phoneNum + "\n";
	}

}
