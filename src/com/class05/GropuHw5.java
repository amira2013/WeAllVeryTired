package com.class05;

public class GropuHw5 {

	public static void main(String[] args) {
		//Write a program to swap 2 numbers without a temporary variable?
		int x = 10;
        int y = 5;
        System.out.println("Before swaping :"+" x="+x+" y="+y);
        x = x + y;
        y = x - y;
        x = x - y;
       
        System.out.println("After swaping:"
                           + " x = " + x + ", y = " + y);
	}

}
