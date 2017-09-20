package com.javabasics.rajeshwar;

/**
 * @author rajeshwar(rsharma96)
 *
 */

public class Operators {

	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		if (value1 == value2)
			System.out.println("value1 == value2");
		if (value1 != value2)
			System.out.println("value1 != value2");
		if (value1 > value2)
			System.out.println("value1 > value2");
		if (value1 < value2)
			System.out.println("value1 < value2");
		if (value1 <= value2)
			System.out.println("value1 <= value2");
	}
}

class ConditionalDemo1 {

	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		if ((value1 == 1) && (value2 == 2))
			System.out.println("value1 is 1 AND value2 is 2");
		if ((value1 == 1) || (value2 == 1))
			System.out.println("value1 is 1 OR value2 is 1");
	}
}

class ConcatDemo {
	public static void main(String[] args) {
		String firstString = "This is";
		String secondString = " a concatenated string.";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);
	}
}

class ArithmeticDemo {

	public static void main(String[] args) {

		int result = 1 + 2;
		// result is now 3
		System.out.println("1 + 2 = " + result);
		int original_result = result;

		result = result - 1;
		// result is now 2
		System.out.println(original_result + " - 1 = " + result);
		original_result = result;

		result = result * 2;
		// result is now 4
		System.out.println(original_result + " * 2 = " + result);
		original_result = result;

		result = result / 2;
		// result is now 2
		System.out.println(original_result + " / 2 = " + result);
		original_result = result;

		result = result + 8;
		// result is now 10
		System.out.println(original_result + " + 8 = " + result);
		original_result = result;

		result = result % 7;
		// result is now 3
		System.out.println(original_result + " % 7 = " + result);
	}

	public void assignmentOperators() {

		int x = 10; // here we have assigned value 10 using assignment operator

		System.out.println("Before += : " + x);
		x += 3; // x = x + 3 ;
		System.out.println("After += : " + x);

		System.out.println("Before -= : " + x);
		x -= 3; // x = x - 3 ;
		System.out.println("After -= : " + x);

		System.out.println("Before *= : " + x);
		x *= 3; // x = x * 3 ;
		System.out.println("After *= : " + x);

		System.out.println("Before /= : " + x);
		x /= 3; // x = x / 3 ;
		System.out.println("After /= : " + x);

		System.out.println("Before %= : " + x);
		x %= 3; // x = x % 3 ;
		System.out.println("After %= : " + x);

	}

	public void incrementDecrementOperator() {
		// The increment operator (++) and decrement operator (– –) are for incrementing
		// and decrementing a variable by 1.
		int x = 13;
		int y = 15;
		System.out.println("The value of x before increment is " + x);
		x++;

		System.out.println("The value of x after increment is " + x);

		x = 0;

		System.out.println("The value of x before increment is " + x);
		++x; // this statement simply mean it will first increment then if we print it will
				// print incremented value

		System.out.println("The value of x after increment is " + x);

		y = 10;

		System.out.println("The value of y before decrement is " + y);
		--y; // this will first decrement and then print

		System.out.println("The value of y after decrement is " + y);

	}
	
	
	public static void ternaryOperator(String args[]) {
		
		int z = 18 ; 
		System.out.println(z);
		int a,b,c ; 
		a = b = c = 13 ;
		System.out.printf( "%d %d %d " , a , b, c);
		
		int x = 10 ; int y = 15 ;
		String is = (x > y) ? "x is greater" : "y is greater";
        System.out.println("The value of is is :" + is);
        
        int res = (2 > 3) ? 3 : 2;
        System.out.println("The value of x is " + res);
        
      
	}

}
