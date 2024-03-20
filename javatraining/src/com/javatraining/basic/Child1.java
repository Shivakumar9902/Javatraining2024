package com.javatraining.basic;

public class Child1 extends Parents{
	
	public void bike()
	{
		System.out.println("R15");
	}

	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.bike();
		c1.gold();
		System.out.println(c1.house());
		System.out.println(c1.money());
				
		
	}
	
}
