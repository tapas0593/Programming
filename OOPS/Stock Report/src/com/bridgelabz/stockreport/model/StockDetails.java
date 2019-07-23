package com.bridgelabz.stockreport.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class StockDetails {
	private String stockname;
	private int numberOfShares;
	private double pricePerShare;

}
