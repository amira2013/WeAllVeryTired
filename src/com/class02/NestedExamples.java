package com.class02;

import java.util.Scanner;

public class NestedExamples {

	public static void main(String[] args) {
		String bike;
		boolean sale;
		double price, discount, finalprice = 0;
		Scanner scan;
		// finalprice=price-discount;

		scan = new Scanner(System.in);
		System.out.println("Is there any sale today?");
		sale = scan.nextBoolean();

		if (sale) {
			System.out.println("What is the price ?");
			price = scan.nextDouble();
			if (price < 10) {
				discount = price * 0.05;

			} else if (price > 10 && price < 100) {
				discount = price * 0.1;

			} else if (price > 100 && price < 500) {
				discount = price * 0.2;

			} else
				discount = price * 0.3;

			finalprice = price - discount;
			System.out.println("the price of the bike is " + finalprice);
		} else {
			System.out.println("I am not going to shop today!");
		}

	}
}
