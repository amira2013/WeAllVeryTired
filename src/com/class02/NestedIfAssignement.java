package com.class02;

public class NestedIfAssignement {

	public static void main(String[] args) {
		boolean isDiploma = true;
		boolean isDegree = true;
		double gpa = 3.5;
		if (isDiploma) {
			System.out.println("Congratulations");
			if (isDegree) {
				if (gpa >= 3.5) {
					System.out.println("You are eligible for schoarship");
				} else {
					System.out.println("You should studied harder");
				}

			}

		}

		System.out.println("----------------assignment2--------------------------------------");
		double mortgageRate = 4.5;
		int mortgagePrice = 200000;
		if (mortgageRate> 4.5) {
			System.out.println("I will not buy a house");
		} else {
			System.out.println("I will check which way I will buy a house");
			if (mortgagePrice >= 200000) {
				System.out.println("I will take a loan");
			} else {
				System.out.println("I will pay cash");
			}

		}

	}

}
