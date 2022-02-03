package com.web.java1;

// * Any class name
import com.web.java.Employee;
import com.web.java.Student;

public class Car {

	String colorName;
	int noOfWheels;
	double price;

	void carShow() {

		System.out.println(colorName + " " + noOfWheels + " " + price);
	}

	public static void main(String[] args) {

		Car ford = new Car();

		ford.colorName = "Black";
		ford.noOfWheels = 4;
		ford.price = 10.45;

		ford.carShow();

		Employee nithish = new Employee();

		nithish.empId = 567;
		nithish.emailId = "nith@gmail.com";
		nithish.salary = 378;
		nithish.ceoName = "Suresh";
		nithish.show();

		Student stu = new Student();

		stu.stuId = 1;
		stu.stuAddres = "Chennai";
		stu.display();

	}

}
