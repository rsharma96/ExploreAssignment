/**
 * @author rajeshwar
 * @created_date Sep 21, 2017
 */

package com.javabasics.assignment;

public class Cube {

	public void calculateArea(double width, double height) {

		double area = width * height;
		System.out.printf("The area of cube with width %.2f and height %.2f is %.2f\n", width, height, area);

	}

	public void calculateVolume(double width, double height, double length) {

		double volume = length * width * height;
		System.out.printf("The volume of cube with length %.2f , width %.2f " + "and height %.2f is %.2f\n", length,
				width, height, volume);

	}

	public static void main(String[] args) {
		
		Cube c = new Cube();
		// 1.	Length = 20, Width = 15, Height = 10
		c.calculateArea(15, 10);
		c.calculateVolume(15, 10, 20);
		
		//2.	Length = 34, Width = 25, Height = 20

		c.calculateArea(25, 20);
		c.calculateVolume(25, 20, 34);
		
		//3.	Length = 40, Width = 35, Height = 30
		c.calculateArea(35, 30);
		c.calculateVolume(35, 30, 40);
	



	}

}
