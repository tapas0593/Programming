package com.bridgelabz.creationaldesignpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	private List<String> employeeList;

	public Employees() {
		employeeList = new ArrayList<>();
	}

	public Employees(List<String> newList) {
		this.employeeList = newList;
	}

	public void loadData() {
		// read all employees from database and put into the list
		employeeList.add("Tapas");
		employeeList.add("Kumar");
		employeeList.add("David");
		employeeList.add("Aastha");
	}

	public List<String> getEmployeeList() {
		return employeeList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> newList = new ArrayList<>();
		for (String employee : this.getEmployeeList())
			newList.add(employee);
		return new Employees(newList);
	}
}
