package com.class02;

public class Variablevalues {

	public static void main(String[] args) {
		double a = 10.5;
		double b = 20.5;
		double sum1 = a + b;
		double mult = a * b;
		double div = a / b;
		double sub = a - b;
		double c = 3.9;
		double square = c * c;
		int width = 5;
		int height = 8;
		int perim = (2 * width) + (2 * height);
		int area = width * height;

		System.out.println("The addition of 2 numbers " + a + " and " + b + " is equal to " + sum1);
		System.out.println("The multiplication of 2 numbers " + a + " and " + b + " is equal to " + mult);
		System.out.println("The division of 2 numbers " + a + " and " + b + " is equal to " + div);
		System.out.println("The substraction of 2 numbers " + a + " and " + b + " is equal to " + sub);
		System.out.println("The square of the " + c + " is " + square);
		System.out.println("The perimeter of a rectangle with width: " + width + " and height:  " + height
				+ " is equal to " + perim + "  and the area is:" 
				+ area);

	}

}
