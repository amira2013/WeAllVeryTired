package com.class05;

public class GroupHw2 {

	public static void main(String[] args) {
		int[][] nums = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		for (int r = 0; r < nums.length; r++) {
			for (int c = 0; c < nums[r].length; c++) {
				int even = nums[r][c];
				if (even % 2 == 0) {
					System.out.print(even + " ");
				}

			}

		}
		System.out.println();

	}

}
