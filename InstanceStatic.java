/**
 * @author rajeshwar
 * @created_date Sep 21, 2017
 */

package com.javabasics.assignment;

public class InstanceStatic {

	int inst1 = 30;
	int inst2 = 50;
	static String stat1 = "Krishna";
	static double stat2 = 55.55;

	public void instanceMethod() {

		// calling instance variables inst1 and inst2
		System.out.println(inst1); // no need of object creation
		System.out.println(inst2); // no need og object creation

		// calling static variables stat1 and stat2
		System.out.println(stat1); // no need of object creation
		System.out.println(stat2); // no need og object creation

	}

	public static void staticMethod() {

		// calling instance variables inst1 and inst2
		// System.out.println(inst1); // throw error without object
		// System.out.println(inst2); // throw error without object
		// Creating object
		InstanceStatic is = new InstanceStatic();
		System.out.println(is.inst1); // no error with object
		System.out.println(is.inst2); // no error with object

		// calling static variables stat1 and stat2
		System.out.println(stat1); // no need of object creation
		System.out.println(stat2); // no need og object creation

	}

	public static void main(String[] args) {
		// Calling instanceMethod()
		// instanceMethod(); // throw error w/o object
		// Creating object
		InstanceStatic is = new InstanceStatic();
		is.instanceMethod(); // no more error

		staticMethod(); // no need of object
	}

}
