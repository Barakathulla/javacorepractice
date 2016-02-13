package com.InterviewQuestions;

public class Employee {

	private int empId;
	private String name;
	private String email;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
