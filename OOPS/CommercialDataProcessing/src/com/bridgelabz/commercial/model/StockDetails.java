package com.bridgelabz.commercial.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StockDetails {
	private String stockName;
	private int noOfShares;
	private double price;
	
}
