package com.scjp.exception;

/*
 *  @author Nisar
 */
public class ExceptionDemo extends Demo {

	public void m1() throws NullPointerException {
		System.out.println(" Demo Class Throws Exeption ");
	}

	public static void main(String[] args) throws Exception {
		Demo demo = new ExceptionDemo();
		demo.m1();
	}
}

class Demo {
	public void m1() throws Exception {
		System.out.println(" Demo Class Throws Exeption ");
	}
}