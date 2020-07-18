package com.montran.pojo;

public class Book {
	private int BookNumber;
	private String BookTitle;
	private double Price;
	
	private double totCost(int n)
	{
		return Price*n;
	}
	public void input(int BookNumber, String BookTitle, double Price)
	{
		this.BookNumber = BookNumber;
		this.BookTitle = BookTitle;
		this.Price = Price;
		
	}
	public double purchase(int n) {
		return totCost(n);
	}

}
