package com.bridgelabz.OOP;

import java.util.ArrayList;

public class StockPortfolio {
	public static void stocks() {
		ArrayList<String> stocks = new ArrayList<>();
		stocks.add("Reliance");
		stocks.add("TCS");

		System.out.println(stocks);
	}

	public static void main(String[] args) {
		StockAccountManagement value = new StockAccountManagement();
		stocks();
		value.calculateStock();
		value.calculateTotalStock();
	}

}
