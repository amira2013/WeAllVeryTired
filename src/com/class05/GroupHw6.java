package com.class05;

public class GroupHw6 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		int a = 8;
		boolean isPrime = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime)
			System.out.println(a + " is a prime number");
		else
			System.out.println(a + " is not a prime number");

	}
}
