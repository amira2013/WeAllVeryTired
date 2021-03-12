package com.class04;

public class arraysTask1 {

	public static void main(String[] args) {
		char[]chars=new char[6];
		chars[0]='A';
		chars[1]='B';
		chars[2]='C';
		chars[3]='D';
		chars[5]='E';
		chars[4]='F';
		System.out.println(chars[1]);
		System.out.println("-------------------------------");
		char[]grades= {'A','B','C','D','E','F'};
		int sizes=grades.length;
		//System.out.println(sizes);
		int[]numbers= {10,23,76,90,98};
		for(int num:numbers) {
		System.out.print(num+" ");}
	}

}
