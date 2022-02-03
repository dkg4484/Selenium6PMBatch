package com.web.java;

public class Employee {

	/**
	 * For a class we can able to create multiple objects but each object has its
	 * own
	 * 
	 * copy of its variable and methods
	 * 
	 * 
	 */

	// Variable

	// Instance or Global Variable

	/**
	 * Variable Container to store the data or information
	 */

	/**
	 * Method or Function To perform some action on variable Reusable or Genric
	 * function
	 * 
	 */

	public int empId;
	public String emailId;
	public double salary;
	public String ceoName;

	// Methods

	public void show() {

		System.out.println("EMPID: " + empId + " EMAILID: " + emailId + " SALARY: " + salary + " CEO: " + ceoName);

	}

	public static void main(String[] args) {

		// How to Create an Object in Java?

		// Syntax

		// ClassName referenceVariable = new Constructor();

		// new --> To provide memory to an object

		// Constructor --> How much memory is required by an object

		Employee navin = new Employee();

		navin.empId = 1494;
		navin.emailId = "navin@gmail.com";
		navin.salary = 2500;
		navin.ceoName = "Suresh";

		navin.show();

		Employee reddy = new Employee();

		reddy.empId = 1567;
		reddy.emailId = "reddy@gmail.com";
		reddy.salary = 2566;
		reddy.ceoName = "Suresh";

		reddy.show();

		Employee naren = new Employee();

		naren.empId = 1567;
		naren.emailId = "naren@gmail.com";
		naren.salary = 2566;
		naren.ceoName = "Suresh";

		naren.show();

		Employee dinesh = new Employee();

		dinesh.show();

		// navin , reddy

		Employee satish = navin;

		satish.show();

		Employee dilip = null;

		satish = dilip;

		satish.show(); // NullPointerException or RunTimeException or UncheckedException

		// Object or Instance

//		Class --> n objects (n instances)

		// How many objects we can create for a class? --> Multiple Objects

		// Its purely determined by memory of your machine 2GB 4GB

	}

}
