package com.scjp.exception;

/*
 *  @author Nisar
 */
public class ExceptionDemo extends Demo {

	public void m1() throws RuntimeException {
		System.out.println(" Demo Class Throws Exeption ");
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.m1();
	}
}

class Demo {
	public void m1() {
		System.out.println(" Demo Class");
	}
}