package com.InterviewQuestions;
/*
 * Test the all feasability of Method Overriding in Java 
 */

class A {
	public void method(Object obj) {
		System.out.println(obj + " Method which Object as a Parameter get Called");
	}

	public void method(String msg) {
		System.out.println(msg + " Method which String as  a Parameter get Called");

	}
}

public class MethodOverridingTest {

	public static void main(String[] args) {
		A obj = new A(); // instantiating Object of Class A
		obj.method("null");

	}
}
