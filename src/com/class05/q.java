package com.class05;

public class q {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		

			int[] array = { 1, 4, 3, 6, 8, 2, 5 };

			int what = array[0];

			for (int index = 0; index < array.length; index++) {

			       if (array[index] > what) {

			                  what = array[index];

			        }

			}

			System.out.println(what);
			int count = 0;
			while (count++ < 10) {
			System.out.println("Welcome to Java");
			}
			int y = 0;
			for (int k = 0; k < 10; ++k) {
			y += 1;
			System.out.println(y);
			}

	}

}
