package com.javatraining.basic;

public class AbstractEx1 extends AbstractEx {
	
	public void add_customer(int a)
	{
		System.out.println("customer added");
	}
	public void delete_customer(int a)
	{
		System.out.println("customer deleted");
	}
	
	public static void main(String[] args) {
		AbstractEx1 ab =new AbstractEx1();
		ab.add_customer(12);
		ab.delete_customer(2);
	}

}
