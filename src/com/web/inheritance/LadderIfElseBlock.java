package com.web.inheritance;

public class LadderIfElseBlock {

	public static void main(String[] args) {

		int num = 32;

		/***
		 * 
		 * Greater than 100 or not
		 * 
		 * Equal to 100
		 * 
		 * Lesser than 100
		 * 
		 * 
		 */

		if (num > 100) {

			System.out.println("Greater than 100...");
		}

		else if (num == 100) {

			System.out.println("Equal to 100");
		}

		else if (num < 100)

		{

			System.out.println("Lesser than 100");
		}

		else {

			System.out.println("None");
		}

	}

}
