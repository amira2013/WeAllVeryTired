package com.class02;

public class CompoundOperator {

	public static void main(String[] args) {
		/*
		 * int num=100; num=num+100; System.out.println(num); int num1=100; num1-=100;
		 * System.out.println(num1);
		 */
		
		int a=7*3+6/2-5;
		int b=21-8+a%3*11;
		if(a<b) {
			System.out.println("A<b");
		}
		if(a==b) {
			System.out.println("a=b");
		}
		if(a>b) {
			System.out.println("a>b");
		}
		
		
		
		
		
		}

}
