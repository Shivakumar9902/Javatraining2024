package com.javatraining.condition;

public class ThisEx2 {

	public ThisEx2() { // 2
		this(2, 4);// 3
		System.out.println("default");// 9
	}

	public ThisEx2(int a, int b) {// 4
		this(20, 30, 40);// 5
		System.out.println("two parameterized");// 8
	}

	public ThisEx2(int a, int b, int c) { // 6
		System.out.println("three parameterized constructor");// 7
	}

	public static void main(String[] args) {
		ThisEx2 th = new ThisEx2(); // 1

	}

}
