package com.InterviewQuestions;

public class Add {

	public void add(int... args) {
		for (int i : args) {
			System.out.print(i + "+");
		}
	}

	public static void main(String[] args) {
		Add obj = new Add();
		obj.add(1, 2);
	}

}
