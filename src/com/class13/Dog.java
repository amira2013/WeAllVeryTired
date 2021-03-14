package com.class13;

public class Dog {
	public String Breed;

	public String size;
	public int age;
	public String color;
	public void bark() {
		System.out.println("wow wow wow ");}
		public void sleep() {
			System.out.println("Zzzzzzzzz");}
			public void eat() {
				System.out.println("amamamam");}
				public void look() {
					System.out.println("hi I am a dog my color is "+color);
				}
	

	public static void main(String[] args) {
		Dog bulldog = new Dog();
		bulldog.age = 5;
		bulldog.Breed = "American Bulldog";
		bulldog.size = "Large";
		bulldog.color = "Pink";
		
		bulldog.sleep();
		bulldog.bark();
		bulldog.eat();
		bulldog.look();
		
		Dog beagle=new Dog();
		beagle.age=8;
		beagle.Breed="beagle";
		beagle.size="Large";
		beagle.color="light grey";
		beagle.look();


	}
}