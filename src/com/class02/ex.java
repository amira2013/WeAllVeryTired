package com.class02;

import java.util.Scanner;

public class ex {

	// class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your gender :M or F");
		String gender = scan.nextLine();
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		if (gender.equals("M")) {
			if (age > 25) {
				System.out.println("Man");
			}

			else {
				System.out.println("Boy");

			}

		} else {
			if (age > 25) {
				System.out.println("Woman");

			} else {
				System.out.println("Girl");

			}

		}

	}
}
