package com.javatraining.condition;

public class FinalEx {

	 int a = 30;

	public static void main(String[] args) {
		
		FinalEx fn = new FinalEx();
		fn.sum();

	}

	public void sum() {
		a = 65;
		int b = 45;
		System.out.println(a + b);
	}

}

  // Final keyword : is used for restriction
//   variable :if we use final keyword with a variable so 
//we can't change the value of that variable value in entire code it bahaves 

// method: if we use final keyword with the method we can't override that method 

//class: if we use final keyword with clss we can't extend the property of that particular class
