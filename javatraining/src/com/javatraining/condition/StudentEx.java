package com.javatraining.condition;

public class StudentEx {

	public int sid;
	public String sname;

	public StudentEx(int sid, String sname) {

		this.sid=sid;
		//sid=12;
		this.sname=sname;
		//sname
	}
	public void display()
	{
		System.out.println("student Id"+sid);
	}

	public static void main(String[] args) {

		StudentEx s = new StudentEx(12, "shiva");

	}
}
