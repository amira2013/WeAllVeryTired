package com.class05;

public class GroupHw4 {

	public static void main(String[] args) {
		String[][] countries = { { "USA", "Mexico", "Canada" }, 
				{ "Peru", "Brazil", "Columbia", "Bolivia" },
				{ "France", "spain", "Italy", "Germany" },
				{ "Morocco", "Egypt", "Senegal","Ethiopia" }

		};

		for (int r = 0; r < countries.length; r++) {
			for (int c = 0; c < countries[r].length; c++) {
				System.out.print(countries[r][c] + " ");

			}
		}
		System.out.println();

		for (String[] flag : countries) {
			for (String g : flag) {
				System.out.print(g + " ");
			}
		}
		System.out.println();

	}}


