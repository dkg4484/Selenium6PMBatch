package com.web.inheritance;

/**
 * 
 * Inheritance is the process of extending parent class to the child
 * 
 * extends keyword
 * 
 * To reduce the number of objects creation
 * 
 * @author User
 *
 */

public class NokiaV2 extends NokiaV1 { // Child or Sub or Derived

//	V2 = V2 (FP) + V1(C,T,C);
	// CAll Text Camera copied to V2

	public void fingerPrint() {

		System.out.println("Lock/Unlock");

	}

	public static void main(String[] args) {

		NokiaV2 v2 = new NokiaV2();
		v2.call();
		v2.text();
		v2.camera();

		v2.fingerPrint();

	}

}
