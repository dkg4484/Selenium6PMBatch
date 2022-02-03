package com.web.java;

public class Student {

	public int stuId;
	public String stuAddres;
	char dept;
	String hod;

	public void display() {

		System.out.println(stuId + " " + stuAddres + " " + dept + " " + hod);

	}

	public static void main(String[] args) {

		Student arivarasan = new Student();
		arivarasan.stuId = 1;
		arivarasan.stuAddres = "Chennai";
		arivarasan.dept = 'A';
		arivarasan.hod = "Maha";

		arivarasan.display();

		Employee navin = new Employee();

		navin.emailId = "navin@gmail.com";
		navin.empId = 122;
		navin.salary = 367;
		navin.ceoName = "Suresh";

		navin.show();

//		Employee --> Class 

//		Members --> Variable + Method ---> 4 + 1

	}

}
