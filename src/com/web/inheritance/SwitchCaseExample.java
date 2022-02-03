package com.web.inheritance;

public class SwitchCaseExample {

	/**
	 * 
	 * if browsername matches then i should return the browser name
	 * 
	 * 91.0 92.0 93.0 94.0 95.0
	 * 
	 * @param args
	 */

	/***
	 * 
	 * Anish --> 101 Abhnisha --> 102 Aarthi --> 103 Balaji --> 104 Cathrin
	 * 
	 * @param browserName
	 * @return
	 */

	public double browserVersionSelection(String browserName) { // Parameter

		switch (browserName) { // Parameter

		case "CHROME1":

			System.out.println("CHROME1=========");

			return 91.0;

		case "CHROME2":

			System.out.println("CHROME2==========");
			return 92.0;

		case "CHROME3":

			System.out.println("CHROME3============");
			return 93.0;

		case "CHROME4":

			System.out.println("CHROME4==============");
			return 94.0;

		default:

			System.out.println("CHROME5=====");

			return 95.0;

		}

	}

	public static void main(String[] args) {

		SwitchCaseExample s = new SwitchCaseExample();

		double version = s.browserVersionSelection("CHROME3"); // ARguments

		System.out.println(version);

	}

}
