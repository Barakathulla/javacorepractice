package com.InterviewQuestions;

/*
 * When using the instanceof operator, keep in mind that null is not an instance of anything.
 */
public class InstanceOfDemo {
	// main Starts Here
	public static void main(String[] args) {

		ATest obj = null;
		ATest b = new B();
		ATest c = new C();
		System.out.println(b instanceof ATest); // return True
		System.out.println(c instanceof ATest); // return True
		System.out.println(obj instanceof ATest); // return false becoz of null
													// is not a type
	}

}

class ATest {
	public void display() {
		System.out.println("Display Method From A");
	}
}

class B extends ATest {
	public void display() {
		System.out.println("Display Method From A");
	}
}

class C extends ATest {
	public void display() {
		System.out.println("Display Method From A");
	}
}