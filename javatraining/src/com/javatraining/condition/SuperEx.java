package com.javatraining.condition;

class Animal{
	int a=1;
	String name="lion";
	public Animal()
	{
		System.out.println("this is super class constructor");
	}
	public Animal(int a)
	{
		System.out.println("this is super class second constructor");
	}
}

class Dog extends Animal
{
	String name="dog";
	public Dog()
	{
		super(12);
		System.out.println("this is child constructor");
	}
	
	void display() {
		System.out.println(super.name);
	}
}

public class SuperEx 
{
	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();
		
		
	}

}
