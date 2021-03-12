package com.class02;

import java.util.Scanner;

public class Issue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two strings");
		String word1 = scan.nextLine();
		String word2 = scan.nextLine();
		System.out.println("Please enter two numbers");
		int int1 = scan.nextInt();
		int int2 = scan.nextInt();
		if (word2.equals(word1) && (int1 == int2))
				 {
			System.out.println("AND");
		} else if (word1.equals("word2") || int1 == int2) {
			System.out.println("OR");

		} else if (!word1.equals("word2") && !(int1 == int2)) {
			System.out.println("NONE");
		}
	}

}
