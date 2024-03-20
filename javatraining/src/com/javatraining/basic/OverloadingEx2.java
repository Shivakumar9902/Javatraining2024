package com.javatraining.basic;

public class OverloadingEx2 {

	public static void main(String[] args) {
		OverloadingEx2 ovr2=new OverloadingEx2();
		ovr2.add(23,50);
		ovr2.add(20,30,40);
		ovr2.add(50, 20, 30, 60);
	}
	
	
	public void add(int a,int b)
	{
		System.out.println("two arguments :"+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("three arguments :"+(a+b+c));
	}
	public void add(int a,int b,int c,int d)
	{
		System.out.println("four arguments :"+(a+b+c+d));
	}
}
