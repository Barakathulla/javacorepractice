package com.InterviewQuestions;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;

/*
 * Program to parse an Java Object to JSON 
 */
public class JsonDemoTest {

	public static void main(String[] args) {

		Employee emp = new Employee(); // creating instance of Object
		/*emp.setEmpId(1);
		emp.setName("Nisar");
		emp.setEmail("barakathulla.shaik@zensar.in");*/
		JSONObject obj = new JSONObject(emp);
		System.out.println(" JSON REPRESENTATION OF EMPLOYEE " + obj.toString());
		parseJsonToObject(obj);

	}

	/*
	 * Param JSONObject Convert JSONObject to java Object
	 */
	public static void parseJsonToObject(JSONObject obj) {
		String jsonData = obj.toString();
		if (jsonData != null && !jsonData.isEmpty()) {
			ObjectMapper objectMapper = new ObjectMapper();
			try {
				Employee employee = objectMapper.readValue(jsonData, Employee.class);
				/*employee.setEmail("shaikbnisar786@gmail.com");*/
				System.out.println(employee.getEmail());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}