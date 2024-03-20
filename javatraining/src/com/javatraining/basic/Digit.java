package com.javatraining.basic;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = sc.nextInt();
		int rem = a % 10;
		System.out.println("remender is :" + rem);

	}
}
