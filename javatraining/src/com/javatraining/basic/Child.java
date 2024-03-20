package com.javatraining.basic;

public class Child extends Parents{

	public String car()
	{
		return "BMW";
	}
	
	public static void main(String[] args) {
		Child ch=new Child();
		
		System.out.println(ch.car());
		System.out.println(ch.money());
		System.out.println(ch.house());
		ch.land();
		ch.gold();
		
		
		
		
		
	}
}
