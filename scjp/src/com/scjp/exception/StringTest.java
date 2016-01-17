package com.scjp.exception;

/*
 * @uthor Nisar 
 */
public class StringTest {

	public static void main(String[] args) {
		String message = "World Hello";
		System.out.println(getMessage(message));
	}

	/*
	 * @param String
	 * 
	 * return reverse of String word by word
	 */
	public static String getMessage(String message) {
		String msg = "";
		if (message != null) {
			String[] data = message.split(" ");
			for (int i = data.length - 1; i >= 0; i--) {
				msg += data[i];
			}

		}
		return msg;
	}

}
