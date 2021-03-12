package com.class02;

import java.util.Scanner;

public class LogicallOperator {

	public static void main(String[] args) {
		double length;
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Please enter your height");
		length=scan.nextDouble();
		if(length>0 && length<=60) {
			System.out.println("you are short");
		}
		else if(length>60 && length<72) {
			System.out.println("you are medium");
		}
		else if(length>72) {System.out.println("you are tall");}
		else {System.out.println("length is invalid");};
		
		

	}

}
