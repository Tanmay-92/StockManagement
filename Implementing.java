package com.Bridgelabz;

import java.util.LinkedList;

public class Implementing {
	
	
	LinkedList<Stock> sharesList = new LinkedList<Stock>();
	
	
	public void addStock(Stock share)
	{
		if (sharesList.contains(share))
		{
			System.err.println("Inventory Item Exists");
		}
		else
		{
		sharesList.add(share);
		}
		
	}

	
	public void getStockDetails()
	{
		for (Stock stocks : sharesList)
		{
			System.out.println(stocks);
		}		
	}

	
	public void calculateShareValue()
	{
		double totalvalue = 0;
		for (Stock stocks : sharesList)
		{
			double value = stocks.getShareCount() *stocks.getSharePrice();
			System.out.println("Value of "+stocks.getName_of_share()+" is "+value);
			totalvalue = totalvalue + value;
		}
		System.out.println("Total value is: "+totalvalue);
	}
	

}
