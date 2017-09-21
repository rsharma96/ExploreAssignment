/**
 * @author rajeshwar
 * @created_date Sep 21, 2017
 */

package com.javabasics.assignment;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReturnMethod {

	static String greet;

	public String acceptInputScanner() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Whats your name ?");
		String name = sc.nextLine();
		sc.close();
		return "Hello " + name;

	}

	public String acceptInputJoption() {

		String name = JOptionPane.showInputDialog(null, "What's your name ?");

		return "Hello " + name;

	}

	public static void main(String[] args) {

		ReturnMethod rm = new ReturnMethod();
		greet = rm.acceptInputScanner();
		System.out.println(greet);
		greet = rm.acceptInputJoption();
		System.out.println(greet);
		

	}

}
