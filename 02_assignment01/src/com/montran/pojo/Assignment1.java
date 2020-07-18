package com.montran.pojo;

public class Assignment1 {
	private int book_no;
	private String book_title;
	private double price;
	
	private double totCost(int n)
	{
		return price*n;
	}
	public void input(int book_no, String book_title, double price)
	{
		this.book_no = book_no;
		this.book_title = book_title;
		this.price = price;
		
	}
	public double purchase(int n) {
		return totCost(n);
	}

}
