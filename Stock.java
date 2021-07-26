package com.Bridgelabz;

public class Stock {
	
	private String Name_of_share;
	private double Price_of_share;
	private double Count_of_share;
	

	public String getName_of_share() {
		return Name_of_share;
	}
	
	public void setName_of_share(String Name_of_share) {
		this.Name_of_share = Name_of_share;
	}
	
	public double getSharePrice() {
		return Price_of_share;
	}
	
	public void setSharePrice(double Price_of_share) {
		if (Price_of_share < 0.0) {
			System.err.println("Price Couldn't be zero");
		}
		else {
		this.Price_of_share = Price_of_share;
		}
	}
	
	public double getShareCount() {
		return Count_of_share ;
	}
	
	public void setShareCount(double Count_of_share) {
		if (Count_of_share < 0.0) {
			System.err.println("Share can't be zero");
		}
		else {
		this.Count_of_share = Count_of_share;
		}
	}


	public String toString() {
		return "Stocks [Name_of_share =" + Name_of_share + ", sharePrice=" + Price_of_share + ", shareCount=" + Count_of_share + "]";
	}
	
	
	
	
	

}
