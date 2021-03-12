package com.class02;

public class NestedIfExamples {

	public static void main(String[] args) {
		boolean isFriday = false;
		int day = 13;
		boolean isEvening = false;
		if (isFriday) {
			System.out.println("It is a movie day!!!!!");
			if (day == 13) {
				System.out.println("I will watch a scary movie");
			} else {
				System.out.println("I watch any available movie");
			}
		} else {
			System.out.println("Let me check if I have class today");
			if (isEvening) {
				System.out.println("I will stay home and learn java");
			} else {
				System.out.println("I play soccer");
			}
		}

	}
}
