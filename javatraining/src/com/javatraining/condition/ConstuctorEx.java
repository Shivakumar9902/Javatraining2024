package com.javatraining.condition;

public class ConstuctorEx {
	// constructor have same name as class name,it is a special type of method it is
	// not accept any return type
	// main purpose is to create object reference of a class

	public ConstuctorEx() {
		System.out.println("default constructor");
	}

	public ConstuctorEx(int a, int b) {
		System.out.println("parameterized constuctor");
	}

	public static void main(String[] args) {

		ConstuctorEx con = new ConstuctorEx(20, 30);
		ConstuctorEx con1 = new ConstuctorEx();

	}
}
