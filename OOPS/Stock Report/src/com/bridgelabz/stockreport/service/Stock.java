package com.bridgelabz.stockreport.service;

import com.bridgelabz.stockreport.model.StockDetails;

public interface Stock {
	public StockDetails[] readJSONFile(String fileName);

	public void calculateStockValue(StockDetails[] array);
}
