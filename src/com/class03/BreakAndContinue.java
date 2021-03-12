package com.class03;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		  for (int i = 1; i < 50; i++) { if (i % 3 == 0) { continue; }
		  System.out.print(i + " "); }
		 
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------");
		
		System.out.println("Please apply for credit card");
		 String resp = scan.nextLine();
		while (!resp.equals("yes")) {
			System.out.println("Please apply for credit card");
			resp = scan.nextLine();
			}
		System.out.println("congratulations");
}}
