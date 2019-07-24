package com.bridgelabz.commercial.service;

public interface Stock {
	public double valueOf();

	public void buy(int noOfShares, String stockName);

	public void sell(int noOfShares, String stockName);

	public void printReport();

	public void save(String fileName);
}
