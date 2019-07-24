package com.bridgelabz.commercial.serviceimplementation;

import java.io.FileReader;
import java.io.FileWriter;

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
	public StockAccount(String fileName) {
		JSONParser parser=new JSONParser();
		try {
			FileReader fr=new FileReader("/home/admin237/Desktop/MY_WS/CommercialDataProcessing/src/StockShares.json");
			JSONArray stockArray=(JSONArray)parser.parse(fr);
			for(Object obj: stockArray) {
				StockDetails stockDetail = new StockDetails();
				JSONObject stock=(JSONObject)obj;
				stockDetail.setStockName((String)stock.get("stockName"));
				stockDetail.setNoOfShares(((Number)stock.get("noOfShares")).intValue());
				stockDetail.setPrice((double)stock.get("price"));
				list.add(stockDetail);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public double valueOf() {
		Node<StockDetails> temp=list.getHead();
		double totalPrice=0.0;
		while(temp!=null) {
			String stockName=(String)temp.getData().getStockName();
			double price=0.0;
			int noOfShares=temp.getData().getNoOfShares();
			price=temp.getData().getPrice()*noOfShares;
			System.out.println("Price for "+stockName+" is: Rs."+price);
			totalPrice+=price;
			temp=temp.getNextNode();
		}
		return totalPrice;
	}

	@Override
	public void buy(int noOfShares, String stockName) {
		Node<StockDetails> temp=list.getHead();
		while(temp!=null) {
			StockDetails data=temp.getData();
			if(data.getStockName().equalsIgnoreCase(stockName)) {
				data.setNoOfShares(data.getNoOfShares()+noOfShares);
				break;
			}
			temp=temp.getNextNode();
		}
//		writeToFile();
		display();
	}
	
	@Override
	public void sell(int noOfShares, String stockName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printReport() {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(String fileName) {
		// TODO Auto-generated method stub

	}
	public void display() {
		Node<StockDetails> temp=list.getHead(); 
		while(temp!=null) {
			System.out.println("Stock Name: "+temp.getData().getStockName());
			System.out.println("Number of shares: "+temp.getData().getNoOfShares());
			System.out.println("Price Per share: "+temp.getData().getPrice());
			temp=temp.getNextNode();
		}
	}
	public void writeToFile() {
		GsonBuilder build = new GsonBuilder();
		build.setPrettyPrinting();
		Gson gson = build.create();
		try {
			FileWriter writer = new FileWriter("/home/admin237/Desktop/MY_WS/CommercialDataProcessing/src/StockShares.json");
			writer.write(gson.toJson(list));
			writer.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
