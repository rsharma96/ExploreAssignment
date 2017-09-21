/**
 * @author rajeshwar
 * @created_date Sep 21, 2017
 */

package com.javabasics.assignment;

public class InterestRate {

	long principal = 46900;

	public void calculateInterestRate(long interest, double time) {

		double rate = interest / (principal * time);

		System.out.printf("The rate of interest for principal 46900 at interest %d and time %.1f is %.4f percent \n ",
				interest, time, rate * 100); // rate *100 to convert rate into %

	}

	public static void main(String[] args) {
		InterestRate ir = new InterestRate();
		// 1. I = 2500, T = 2 years
		ir.calculateInterestRate(2500, 2);
		// 2. I = 4500, T = 1 years
		ir.calculateInterestRate(4500, 1);
		// 3. I = 3500, T = 1.5 years
		ir.calculateInterestRate(3500, 1.5);

	}

}
