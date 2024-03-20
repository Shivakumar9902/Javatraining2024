package com.javatraining.condition;

import java.util.Scanner;

public class DaysEx {
	public static void main(String[] args) {
		

	Scanner sc =new Scanner(System.in);
	System.out.println("enter any week day");
	String s=sc.nextLine();
	switch(s) {
	
	case"sunday":
		System.out.println("its sunday");
	break;
	
	case"monday":
		System.out.println("its monday");
	break;
	
	case"tuesday":
		System.out.println("its tuesday");
	break;
	
	case"wednesday":
		System.out.println("its wednesday");
	break;
	
	case"friday":
		System.out.println("its friday");
	break;
	
	case"saturday":
		System.out.println("its saturday");
	break;
	
	case"Thuesday":
		System.out.println("its Thuesday");
	break;

	}
	System.out.println(" ");
	}		

}
