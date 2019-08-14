package com.bridgelabz.creationaldesignpattern.test;

import java.util.List;

import com.bridgelabz.creationaldesignpattern.prototype.Employees;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees employee = new Employees();
		employee.loadData();
		Employees employee1 = (Employees) employee.clone();
		Employees employee2 = (Employees) employee.clone();
		List<String> list1 = employee1.getEmployeeList();
		List<String> list2 = employee2.getEmployeeList();
		list1.remove("Kumar");
		list2.remove("David");
		list1.add("Ajaya");
		list2.add("May");
		System.out.println("Employee List: " + employee.getEmployeeList());
		System.out.println("Employee1 List: " + list1);
		System.out.println("Employee2 list: " + list2);
	}

}
