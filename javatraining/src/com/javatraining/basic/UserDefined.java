package com.javatraining.basic;

import java.util.Scanner;

public class UserDefined {

	public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
     System.out.println("enter the two values");

     int a=sc.nextInt();
     int b=sc.nextInt();
     int temp;
     temp=a;
     a=b;
     b=temp;
     
     
     System.out.println("a value"+ a);
	
     System.out.println("b value"+b);
     
	}
}