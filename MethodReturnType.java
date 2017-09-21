/**
 * @author rajeshwar
 * @created_date Sep 21, 2017
 */

package com.javabasics.assignment;

public class MethodReturnType {

	public boolean returnBoolean() {

		boolean b = true;

		return b;

	}

	public String returnString() {

		String s = "Hare Krishna";

		return s;

	}

	public long returnLong() {

		long l = 34567;

		return l;

	}

	public double returnDouble() {

		double d = 345.675;

		return d;

	}

	public static void main(String[] args) {
		
		MethodReturnType m = new MethodReturnType();
		boolean result1 = m.returnBoolean();
		System.out.println("The return value of returnBoolean() is : " + result1);
		String result2 = m.returnString();
		System.out.println("The return value of returnString() is : " + result2);
		long result3 = m.returnLong();
		System.out.println("The return value of returnLong() is : " + result3);
		double result4 = m.returnDouble();
		System.out.println("The return value of returnDouble() is : " + result4);

	}

}
