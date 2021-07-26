package com.Bridgelabz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Implementing ss = new Implementing();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Stocks management");
		System.out.println("Enter the num of shares to add: ");
		int numOfShares = sc.nextInt();
		
		for (int i = 0; i < numOfShares; i++) {
			
			Stock newItem = new Stock();
			
			System.out.println("Enter Share name: ");
			newItem.setName_of_share(sc.next());
			System.out.println("Enter Share Price: ");
			newItem.setSharePrice(sc.nextDouble());
			System.out.println("Enter no. of Share taken: ");
			newItem.setShareCount(sc.nextDouble());	
			ss.addStock(newItem);
		}
		ss.getStockDetails();
		ss.calculateShareValue();
		sc.close();
	}

}
