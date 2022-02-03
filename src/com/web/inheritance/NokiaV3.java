package com.web.inheritance;

public class NokiaV3 extends NokiaV2 {

	public void faceLock() {

		System.out.println("FLock");
	}

	public static void main(String[] args) {

		NokiaV3 v3 = new NokiaV3();
		v3.faceLock();
		v3.call();
		v3.text();
		v3.camera();
		v3.fingerPrint();

	}

}
