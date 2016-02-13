package com.InterviewQuestions;

import java.util.HashMap;

public class HashCodeTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("New");
		System.out.println(sb.hashCode());
		sb.append("hai");
		System.out.println(sb.hashCode());
		String msg = new String("Hello");
		System.out.println(msg.hashCode());
		msg = "hai";
		System.out.println(msg.hashCode());
		HashMap map = new HashMap();
		map.put(sb, "new");
		map.put(sb.append("hai"), "new");
		System.out.println(map.size());

	}

}
