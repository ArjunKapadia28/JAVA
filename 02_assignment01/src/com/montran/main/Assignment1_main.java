package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Assignment1;

public class Assignment1_main {

	public static void main(String[] args) {
		Assignment1 assignment1 = new Assignment1();
		Scanner scanner = new Scanner(System.in);
		
		Assignment1 book = null;
		book.input(01, "xyz", 150);
		int a = scanner.nextInt();
		
		
		System.out.println("Enter The Number of Copies");
		int n = scanner.nextInt();
		if(n > 0)
			System.out.println("Total Amount To Be Paid is :" + book.purchase(n));
		else
			System.out.println("Please Enter Valid Number Of Copies");
	}

}

