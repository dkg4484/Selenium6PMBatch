package com.web.inheritance;

public class MainClass {

	public static void main(String[] args) {

		int num = 10;

		if (num > 5) {// Conditional expression or boolean expression --> true/false

			num = num + 1;

			System.out.println("Greater than 5...." + num);

			if (num % 2 == 0) {

				System.out.println("Even num");

			} else {

				System.out.println("ODD num");

				if (num % 10 == 0) {

					System.out.println("Divisble by 10..");
				}

				else {

					System.out.println("Not divisble by 10;");
				}
			}

		}

		else {

			num = num - 1;

			System.out.println("Lesser than 5.." + num);
		}

		System.out.println("End");

	}

}
