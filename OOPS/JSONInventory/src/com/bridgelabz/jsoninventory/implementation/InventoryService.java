package com.bridgelabz.jsoninventory.implementation;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryService {
	public void readFile() {

		JSONParser parser = new JSONParser();
		try {
			FileReader fr = new FileReader("/home/admin237/Desktop/MY_WS/JSONInventory/src/InventoryDetails.json");
			JSONArray array = (JSONArray) parser.parse(fr);
			for (Object obj1 : array) {
				Double totalWeight = 0.0;
				Double totalPrice = 0.0;
				JSONObject details1 = (JSONObject) obj1;
				String inventory = (String) details1.get("inventory");
				System.out.println(inventory);
				JSONArray listofinventories = (JSONArray) details1.get("listofinventories");
				System.out.println(listofinventories);
				for (Object obj2 : listofinventories) {
					JSONObject details2 = (JSONObject) obj2;
					Double weight = (Double) details2.get("weight");
					Double price = (Double) details2.get("price");
					totalWeight += weight;
					totalPrice += weight * price;
				}
				System.out.println("Total Weight of " + inventory + ": " + totalWeight + "Kg");
				System.out.println("Total Price of " + inventory + ": Rs." + totalPrice);
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
