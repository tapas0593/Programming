package com.bridgelabz.jsoninventory.main;

import com.bridgelabz.jsoninventory.implementation.InventoryService;

public class InventoryMain {

	public static void main(String[] args) {
		InventoryService imp=new InventoryService();
		imp.readFile();
	}

}
