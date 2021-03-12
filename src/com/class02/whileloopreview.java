package com.class02;

import java.util.Scanner;

public class whileloopreview {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int price=3;
		System.out.println("Please pay for soda");
		do{ price=scan.nextInt();


			if(price>3) {System.out.println("please give less money");
			System.out.println("Please pay for soda");
			 price=scan.nextInt();
			}
			else if(price<3){System.out.println("please give more money");}}
		

			while(price !=3);
		System.out.println("enjoy");
		

		

}}
