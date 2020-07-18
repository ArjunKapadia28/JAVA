package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Book;

public class BookMainV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book();
		Scanner scanner = new Scanner(System.in);
		
		book.input(1, "Shades", 100);
		
		
		
		System.out.println("Enter required Copies");
		int n = scanner.nextInt();
		if(n > 0)
			System.out.println("Total Amount To Be Paid is :" + book.purchase(n));
		else
			System.out.println("Please Enter Valid Number Of Copies");
	}

}