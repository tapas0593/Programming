package com.bridgelabz.stockreport.model;

public class StockDetails {
	private String stockname;
	private int numberOfShares;
	private double pricePerShare;

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public String getStockname() {
		return stockname;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public double getPricePerShare() {
		return pricePerShare;
	}

}
