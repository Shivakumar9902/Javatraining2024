package com.javatraining.condition;

public class NestedIfEx {
	public static void main(String[] args) {

		int marks = 100;
		if (marks >= 60) {
			System.out.println("passed with first Rank");
		}
		
		else if (marks >= 50) {
				System.out.println("passed with Second rank");
			}
		
		else if (marks >= 30) {
			System.out.println("just passed");
		}
		else
		{
			System.out.println("Better luck next time");
		}

	}

}
