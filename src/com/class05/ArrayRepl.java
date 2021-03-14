package com.class05;

import java.util.Scanner;

public class ArrayRepl {

	

		public static void main(String[] args) {
		int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum = 0;
		for (int i = 0; i <a.length; i++) {
		         if (a[i] % 2== a2[i ] % 5)  {
		                  sum += i * i;
		         }
		}
		System.out.println("sum = " + sum);
		char array_variable [] = new char[10];
		for (int i = 0; i < 10; ++i) {
		         array_variable[i] = 'i';
		         System.out.print(array_variable[i] + " ");
		}
		int arrays_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum1= 0;

		for (int i = 0; i < 3; ++i) {

		   for (int j = 0; j < 3; ++j) {

		       sum1 = sum1 + arrays_variable[i][j];
		}
		}
		System.out.print(sum1 / 5);}}
		