/**
 * @author rsharma
 * @created_date Dec 10, 2017
 */

package com.javabasics.akash;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Here we are going to cover Collection Framework in Java which is one of the very important aspect in Java and 
also important topic from interview point
In simple term, Collections are like containers that groups multiple items in a single unit
Collections are used almost in every programming language
Java Collections Framework consists of following parts:
1. Interfaces 
2. Classes (that implements Interfaces)
3. Algorithms - Algorithms are useful methods to provide some common functionalities, for example searching, sorting and shuffling

Collection Framework in Java is a set of Interfaces and Classes that provides an artictecture to store and manipulate 
the group of objects. 
Previously we have seen Array to store group of elements/objects but there were some limitations with an array such as 
1. The length of the array is not flexible once we define (it means we cannot increase the length of array once we defined it)
2. We can add elements to the array but not possible to remove 

So to overcome these limitations we have collecetion framework in Java
Java Collection framework helps to perform different sorts of operations such as searching, sorting, insertion, deletion, manipulation
and many more.

In collection framework we have a special concept of Iterator 
Iterator is an interface and it provides the facility of iterating through the elements in collection framework 
only in forward direction

Apart from these we can even use for loop and enhanced gor loop to iterate through the collection framework objects

The java.util package contains all the classes and interfaces for Collection framework.
Map is the only interface that doesn’t inherits from Collection interface but it’s part of Collections framework. 
*
*/

public class ArrayListClass {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(123);
		li.add(23);
		List<Integer> ls = new ArrayList<Integer>();

		ArrayList<String> arr = new ArrayList<String>();
		// arr.add(123);
		arr.add("Rama");
		ls.add(123);

		ArrayList<String> array = new ArrayList<String>();

		array.add("Rama");
		array.add("Sushant");
		array.add("Manish");
		array.add("Akash");
		array.add("Swapnil");

		array.remove("Rama");
		array.removeAll(array);
		System.out.println("Remove all" + array);
		System.out.println("Remove object" + array);
		arr.addAll(array);

		System.out.println(arr);

		// array.add(0, "Rama");

		System.out.println(array.size());
		// array.sort(array);
		System.out.println(array.get(3));
		System.out.println();
		System.out.println(array.isEmpty());
		array.remove(0);
		System.out.println(array.size());
		System.out.println(array.get(3));
		array.add(0, "Rama");

		System.out.println(array);
		array.remove(0);
		System.out.println(array);
		array.add(arr.get(1));

		array.get(0);
		array.get(1);
		array.get(2);
		array.get(4);

		for (int i = 0; i < array.size(); i++) {

			System.out.println(array.get(i));
		}

		System.out.println("++++++++++++++++++");
		for (String s : array) {
			System.out.println(s);

		}

		System.out.println("++++++++++++++++++");
		Iterator<String> i = array.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}

	}

}
