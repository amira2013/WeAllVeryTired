package com.class05;

public class GroupHw1 {

	public static void main(String[] args) {
		int sum = 0;
		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[r].length; c++)

				sum += numbers[r][c];
		}
		System.out.println(sum);

	}

}
