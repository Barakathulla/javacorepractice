package com.InterviewQuestions;

/*
 * can we override private or static method 
 * 
 */

class Demo {

	static void method1(int a) {
		System.out.println("method From DEMO Class");
	}
}

public class DemoTest extends Demo {

	static void method1(int a) {
		System.out.println("method From DEMOTest Class");
	}

	public static void main(String[] args) {
		Demo obj = new DemoTest();
		method1(2);

	}
}
