package com.bridgelabz.commercial.serviceimplementation;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.commercial.model.StockDetails;
import com.bridgelabz.commercial.service.Stock;
import com.bridgelabz.datastructure.unorderedlist.LinkedList;
import com.bridgelabz.datastructure.unorderedlist.Node;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StockAccount implements Stock {
	LinkedList<StockDetails> list = new LinkedList<>();
	ArrayList<StockDetails> arrayList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public StockAccount(String FILENAME) {
		JSONParser parser = new JSONParser();
		try {
			FileReader fr = new FileReader(FILENAME);
			JSONArray stockArray = (JSONArray) parser.parse(fr);
			for (Object obj : stockArray) {
				StockDetails stockDetail = new StockDetails();
				JSONObject stock = (JSONObject) obj;
				stockDetail.setStockName((String) stock.get("stockName"));
				stockDetail.setNoOfShares(((Number) stock.get("noOfShares")).intValue());
				stockDetail.setPrice((double) stock.get("price"));
				list.add(stockDetail);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public double valueOf() {
		Node<StockDetails> temp = list.head;
		double totalPrice = 0.0;
		while (temp != null) {
			String stockName = (String) temp.data.getStockName();
			double price = 0.0;
			int noOfShares = temp.data.getNoOfShares();
			price = temp.data.getPrice() * noOfShares;
			System.out.println("Price for " + stockName + " is: Rs." + price);
			totalPrice += price;
			temp = temp.nextNode;
		}
		return totalPrice;
	}

	@Override
	public void buy(int noOfShares, String stockName) {
		Node<StockDetails> temp = list.head;
		boolean found = false;
		while (temp != null) {
			if (temp.data.getStockName().equalsIgnoreCase(stockName)) {
				temp.data.setNoOfShares(temp.data.getNoOfShares() + noOfShares);
				found = true;
				System.out.println("Successfull..!!");
				break;
			} else {
				temp = temp.nextNode;
			}
		}
		if (!found) {
			System.out.println("You don't have an account for: " + stockName + "\n Lets create one!");
			System.out.println("What is the price of each share..?");
			StockDetails newStock = new StockDetails();
			newStock.setPrice(sc.nextDouble());
			newStock.setStockName(stockName);
			newStock.setNoOfShares(noOfShares);
			list.add(newStock);
			System.out.println("Successfull..!!");
		}
	}

	@Override
	public void sell(int noOfShares, String stockName) {
		Node<StockDetails> temp = list.head;
		boolean found = false;
		while (temp != null) {
			StockDetails data = temp.data;
			if (data.getStockName().equalsIgnoreCase(stockName)) {
				found = true;
				if (data.getNoOfShares() >= noOfShares) {
					data.setNoOfShares(data.getNoOfShares() - noOfShares);
				} else {
					System.out.println("FAILED..!! You have only " + data.getNoOfShares() + " shares.");
					break;
				}
				System.out.println("Successfull..!!");
			} else {
				temp = temp.nextNode;
			}
		}
		if (!found) {
			System.out.println("You do not have shares of " + stockName + " to sell.");
		}
	}

	@Override
	public void printReport() {
		Node<StockDetails> temp = list.head;
		while (temp != null) {
			System.out.println("Stock Name: " + temp.data.getStockName());
			System.out.println("You have " + temp.data.getNoOfShares() + " shares.");
			System.out.println("Price Per share: " + temp.data.getPrice());
			temp = temp.nextNode;
			System.out.println();
		}

	}

	@Override
	public void save(String FILENAME) {
		Node<StockDetails> currNode = list.head;
		arrayList.clear();
		while (currNode != null) {
			arrayList.add(currNode.data);
			currNode = currNode.nextNode;
		}
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getNoOfShares() == 0)
				arrayList.remove(i);
		}
		GsonBuilder build = new GsonBuilder();
		build.setPrettyPrinting();
		Gson gson = build.create();
		try {
			FileWriter writer = new FileWriter(FILENAME);
			writer.write(gson.toJson(arrayList));
			writer.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
