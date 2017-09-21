/**
 * @author gaurnitai
 * @created_date Sep 21, 2017
 */

package com.javabasics.assignment;

public class Average {

	public double calculateTotal(double val1, double val2) {

		double total = val1 + val2;

		return total;

	}

	public double calculateAverage(double val1, double val2) {

		double avg = (val1 + val2) / 2;
		return avg;

	}

	public double calculateAverage(double total) {

		double avg = total / 2;
		return avg;
	}

	public static void main(String[] args) {

		Average av = new Average();
		// calling calculateTotal
		double total = av.calculateTotal(276, 345);

		System.out.println("The total of 2 numbers is " + total);

		// Calling calculateAevrage()
		double average = av.calculateAverage(276, 345);

		System.out.println("The average of 2 numbers is " + average);

		double avg = av.calculateAverage(total);

		System.out.println("The average of 2 numbers : " + avg);

	}

}
