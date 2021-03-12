package com.class03;

public class NestedLoop {

	public static void main(String[] args) {
		for(int i=1;i<3;i++) {
			System.out.println("outer loop");
			for(int j=1;j<=3;j++) {
				System.out.println("inner loop");
				
			}
		}
		System.out.println("------------------++++++-------------------------");
		for(int i=1;i<3;i++) {
			System.out.println("**");
			for(int j=1;j<=3;j++) {
				System.out.println("***");
				
			}
		}
	}

}
