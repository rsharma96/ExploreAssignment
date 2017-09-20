/**
 * @author rajeshwar
 * @created_date Sep 20, 2017
 */

package com.javabasics.assignment;

/*(Area and perimeter of a rectangle) Write a program that displays 
 * the area and perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following formula: 
 * area = width * height 
 */

public class Rectangle {

	double width = 4.5;
	double height = 7.9;

	public void calculateArea() {

		double area = width * height;
		System.out.printf("The area of rectangle having height %.2f and width %.2f is %.2f\n", height, width, area);

		// other way to print the same

		System.out.println("The area of rectangle having height " + height + " and width " + width + " is " + area);

	}
	
	public void calculatePerimeter() {

		double perimeter = 2 * (height + width);
		System.out.printf("The perimeter of rectangle having height %.2f and width %.2f is %.2f\n", height, width, perimeter);

		// other way to print the same

		System.out.println("The perimeter of rectangle having height " + height + " and width " + width + " is " + perimeter);

	}

	public void calculateArea(double height, double width) {

		double area = width * height;
		System.out.printf("The area of rectangle having height %.2f and width %.2f is %.2f\n", height, width, area);

		// other way to print the same

		System.out.println("The area of rectangle having height " + height + " and width " + width + " is " + area);

	}

	public void calculatePerimeter(double height, double width) {

		double perimeter = 2 * (height + width);
		
		System.out.printf("The perimeter of rectangle having height %.2f and width %.2f is %.2f\n", height, width, perimeter);

		// other way to print the same

		System.out.println("The perimeter of rectangle having height " + height + " and width " + width + " is " + perimeter);

	}

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		System.out.println("Area of reactangle using method with parameter");
		r.calculateArea(4.5, 7.9);
		System.out.println("\n");
		System.out.println("Area of reactangle using method without parameter");
		r.calculateArea();
		System.out.println("\n");
		System.out.println("Perimeter of reactangle using method with parameter");
		r.calculatePerimeter(4.5, 7.9);
		System.out.println("\n");
		System.out.println("Perimeter of reactangle using method without parameter");
		r.calculatePerimeter();

	}

}
