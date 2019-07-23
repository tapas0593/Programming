package com.bridgelabz.stockreport.main;

import com.bridgelabz.stockreport.model.StockDetails;
import com.bridgelabz.stockreport.service.Stock;
import com.bridgelabz.stockreport.serviceimpl.StockService;

public class StockMain {

	public static void main(String[] args) {
		Stock stock = new StockService();
		StockDetails[] array = stock.readJSONFile("/home/admin237/Desktop/MY_WS/Stock Report/src/Stocks.json");
		stock.calculateStockValue(array);
	}

}
