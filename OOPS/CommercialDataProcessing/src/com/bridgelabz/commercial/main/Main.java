package com.bridgelabz.commercial.main;
import java.util.Scanner;

import com.bridgelabz.commercial.service.Stock;
import com.bridgelabz.commercial.serviceimplementation.StockAccount;
public class Main {

	public static void main(String[] args) {
		Stock stock=new StockAccount("/home/admin237/Desktop/MY_WS/CommercialDataProcessing/src/StockShares.json");
		Scanner sc=new Scanner(System.in);
		boolean continues=true;
		while(continues) {
			System.out.println("Enter 1. for checking the Value of the Stocks");
			System.out.println("Enter 2. to buy shares");
			System.out.println("Enter 3. to sell shares");
			System.out.println("Enter 4. Done");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("\n Total price for all the stocks is: Rs."+stock.valueOf());
				break;
			case 2:
				System.out.println("Enter the Stock name you want to buy");
				String stockName1=sc.next();
				System.out.println("Enter the number of shares you want to buy");
				int noOfShares1=sc.nextInt();
				stock.buy(noOfShares1, stockName1);
				break;
			case 3:
				System.out.println("Enter the Stock name you want to sell");
				String stockName2=sc.next();
				System.out.println("Enter the number of shares you want to sell");
				int noOfShares2=sc.nextInt();
				stock.sell(noOfShares2, stockName2);
				break;
			case 4:
				continues=false;
				System.out.println("Bye..!!");
				break;
				default:
					System.out.println("Invalid input...");
			}
		}
	}

}
