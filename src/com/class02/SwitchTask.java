package com.class02;

import java.util.Scanner;

public class SwitchTask {
	public static void main(String[] args) {
		String carOrigin;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String car = scan.nextLine();
		switch (car) {
		case "BMW":
			carOrigin = "german car";
			break;
		case "Toyota":
			carOrigin = "japanese car";
			break;
		case "Maserati":
			carOrigin = "italian car";
			break;
		default:
			carOrigin = "unknown";
		}
		System.out.println("Your favorite car is " + carOrigin);

	}
}
