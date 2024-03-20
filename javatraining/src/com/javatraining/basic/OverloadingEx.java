package com.javatraining.basic;

public class OverloadingEx {

	public static void main(String[] args) {
		
		OverloadingEx ovr=new OverloadingEx();
		ovr.run();
		ovr.run(20);
		ovr.run(30,20);
		
	}
	
	public void run() //declaration
	{
		System.out.println("no arguments");  //body-implimentation
	}
	
	public void run(int a)
	{
		System.out.println("single arguments");
	}
	public void run(int a,int b)
	{
		System.out.println("double arguments");
	}
	
	
	
}


