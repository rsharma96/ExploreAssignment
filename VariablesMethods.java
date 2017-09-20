package com.javabasics.assignment;

/*Create Instance variable ix & iy and static sx & sy variables within class VariablesMethods 
 * and call both the variables in method with name staticMethod () and instanceMethod ()
 */

public class VariablesMethods {

	int ix = 20; // instance variable
	int iy = 48; // Instance variable
	static int sx = 44; // static variable
	static int sy = 66; // static variable

	public static void staticMethod() {

		// Calling instance variables to static method

		VariablesMethods vm = new VariablesMethods();
		System.out.println("calling ix to static method : " + vm.ix); // here we use object vm to call ix

		System.out.println("calling iy to static method : " + vm.iy); // same here calling through object vm

		// Calling static variable to static method

		System.out.println("calling static sx to static method :" + sx); // no need of object

		System.out.println("calling static sy to static method :" + sy); // no need of object

	}

	public  void instanceMethod() {
		
		// Calling instance variable in Instance method
		
		System.out.println("calling ix to instance method : " + ix); // no need of object

		System.out.println("calling iy to instance method : " + iy); // no need of object
		
		// Calling static variable in Instance method
		
		System.out.println("calling static sx to instance method :" + sx); // no need of object

		System.out.println("calling static sy to instance method :" + sy); // no need of object
		
		// There is another way to call static variable in Instance method in case we are calling in another class
		
		System.out.println("calling static sx to instance method :" + VariablesMethods.sx); // no need of object

		System.out.println("calling static sy to instance method :" + VariablesMethods.sy); // no need of object
		
		
	}

	public static void main(String[] args) {
		
		// Calling static method to static main method()
		
		staticMethod(); // no need of object
		
		System.out.println("\n");
		
		// Calling Instance method to static main method()
		VariablesMethods vm = new VariablesMethods();
		vm.instanceMethod();
		

	}

}
