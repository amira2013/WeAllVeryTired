package com.class04;

public class ArraysTask2 {

	public static void main(String[] args) {
		String[]names=new String[8];
		names[0]="Dris";
		names[1]="Lily";
		names[2]="Yovanna";
		names[3]="Ariana";
		names[4]="Brian";
		names[5]="Jonathan";
		names[6]="Nelson";
		names[7]="Elizabeth";
		System.out.println(names[0]);
		String[]name= {"Dris","Lily","Yovanna","Ariana","Brian","Jonathan","Nelson","Elizabeth"};
		for(int i=name.length-1;i>=0;i--) {
		//for(String na:name) {
		
		System.out.print(name[i]+", ");}
		System.out.println();
		System.out.println("-----------2nd task------------------");
		String[]arrays= {"Java","Saturday","day","coding","is"};
		System.out.println(arrays[1]+" "+arrays[4]+" "+arrays[0]+" "+arrays[3]+" "+arrays[2]);
		String[]array={"s","a","y","n","c","t","d","a","e","x"
	    };
	    System.out.print(array[0]+array[2]+array[3]+array[5]+array[7]+array[9]);
	  
		
		
	}

}
