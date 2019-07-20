package com.bridgelabz.stockreport.main;

import com.bridgelabz.stockreport.model.StockDetails;
import com.bridgelabz.stockreport.service.StockService;
import com.bridgelabz.stockreport.serviceimpl.StockServiceImpl;

public class StockMain {

	public static void main(String[] args) {
		StockService stock = new StockServiceImpl();
		StockDetails[] array = stock.readJSONFile("/home/admin237/Desktop/MY_WS/Stock Report/src/Stocks.json");
		stock.calculateStockValue(array);
	}

}
