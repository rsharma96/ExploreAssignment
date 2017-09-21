/**
 * @author gaurnitai
 * @created_date Sep 21, 2017
 */

package com.javabasics.assignment;

public class Method {

	public static void method1() {

		System.out.println("This is static method with no return type");
	}

	public static int method2() {

		System.out.println("This is static method with int return type");

		return 1; // here we can return any int value
	}

	public static void method3(int a, String b) {

		System.out.println("This is static method with parameter and no return type");

	}

	public static String method4(int x, double b) {

		return "This is static method with parameter and String return type";
	}
	
	public void method5() {

		System.out.println("This is instance method with no return type");
	}

	public int method6() {

		System.out.println("This is instance method with int return type");

		return 1; // here we can return any int value
	}

	public void method7(int a, String b) {

		System.out.println("This is instance method with parameter and no return type");

	}

	public String method8(int x, double b) {

		return "This is instance method with parameter and String return type";
	}

	public static void main(String[] args) {
		
		System.out.println("This is the main method with predefined syntax");

	}

}
