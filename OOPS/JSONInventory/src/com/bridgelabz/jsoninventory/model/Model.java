package com.bridgelabz.jsoninventory.model;

public class Model {
	private String name;
	private double quantity;
	private double price;

	public void setName(String name) {
		this.name = name;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

}
