package com.scjp.exception;

/*
 * @uthor Nisar 
 */
public class StringTest {

	public static void main(String[] args) {
		String message = "World Hello";
		getMessage(message);
	}

	/*
	 * @param String
	 */
	public static void getMessage(String message) {
		String msg = "";
		if (message != null) {
			String[] data = message.split(" ");
			for (String str : data) {
				msg += str;
			}
			System.out.println(msg);
		}
	}

}
