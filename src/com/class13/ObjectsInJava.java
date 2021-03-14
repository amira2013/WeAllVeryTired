package com.class13;

public class ObjectsInJava {

	public static void main(String[] args) {
		MobilePhone Iphone=new MobilePhone();
		Iphone.model="Iphone12";
		Iphone.price=999;
		Iphone.size=6.4;
		Iphone.make="Apple";
		Iphone.color="Black";
		MobilePhone samsung=new MobilePhone();
		samsung.model="S21";
		samsung.price=800;
		samsung.size=6.8;
		samsung.make="samsung";
		samsung.color="Phatom Black";
		System.out.println(Iphone.price);
		System.out.println(samsung.price);
		Iphone.call();
		samsung.call();
	}

}
