package com.javatraining.condition;

public class ThisEx {
	public void method()
	{
		System.out.println("this is one Ex");
	}
	public void method1()
	{
		this.method();
		System.out.println("this is another one");
	}

	public static void main(String[] args) {
		
		ThisEx th=new ThisEx();
		th.method1();
		
	}
}
