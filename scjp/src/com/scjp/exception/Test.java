package com.scjp.exception;

/*
 * @author Nisar 
 */
interface I1 {

	public void display();

	public String getMessage();
}

/*
 * if we do not provide implementation for all the methods then we make class as
 * Abstract
 */
abstract class InterfaceDemo implements I1 {

	@Override
	public void display() {
		System.out.println(" Display Method From Abstract Class");

	}

}

public class Test extends InterfaceDemo {
	public static void main(String[] args) {
		InterfaceDemo interfaceDemo = new Test();

		interfaceDemo.display();
	}

	@Override
	public String getMessage() {
		return " Hello";
	}
}