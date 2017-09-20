package com.javabasics.assignment;

/*Create a class CalculateTemperatureWithParameter {} and within that create two methods with name celciusToFarenheit () 
 * and farenheitToCelcius (). In celciusToFarenheit () method try to convert temperature from 
 * degree celcius to Farenheit and farenheitToCelcius () method try to convert temperature
 *  from degree Farenheit to degree celcius. 
 *  Finally call both the methods in main () method in another class CalculateTemperatureWithParameterTest {} 
 *  and execute
 *  To convert temperatures in degrees Celsius to Fahrenheit, multiply by 1.8 (or 9/5) and add 32
To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and multiply by .5556   

 */

public class CalculateTemperatureWithParameter {

	double celcius;
	double farenheit;

	public void celciusToFarenheit(double temperature) {

		// this method will convert temperature from degree celcius to Farenheit
		// To convert temperatures in degrees Celsius to Fahrenheit, multiply by 1.8 (or
		// 9/5) and add 32
		celcius = temperature;
		farenheit = (celcius * 1.8) + 32;

		System.out.println("The Farenheit conversion for celcius is : " + farenheit);

	}

	public void farenheitToCelcius(double temperature) {
		// this method will convert temperature from Farenheit to degree celcius
		// To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and
		// multiply by .5556
		farenheit = temperature;
		celcius = (farenheit - 32) * 0.5556;

		System.out.println("The celcius temperature for farenheit is : " + celcius);

	}

	public static void main(String[] args) {

		CalculateTemperatureWithParameter ct = new CalculateTemperatureWithParameter();
		// calling celciusToFarenheit()
		ct.celciusToFarenheit(453.576);
		// calling celciusToFarenheit()
		ct.farenheitToCelcius(564.86);

	}

}
