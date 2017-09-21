/**
 * @author gaurnitai
 * @created_date Sep 21, 2017
 */

package com.javabasics.assignment;

public class Average2 {

	public double calculateTotal(double val1, double val2) {

		double total = val1 + val2;

		return total;

	}

	public double calculateAverage() {

		double total = calculateTotal(345.45, 678.55); // calling calculateTotal() in calculateAverage()
		double avg = total / 2;
		return avg;
	}

	public static void main(String[] args) {

		Average2 av = new Average2();

		// Calling calculateAverage()
		double average = av.calculateAverage();

		System.out.println("The average of 2 numbers is " + average);

	}

}
