/**
 * @author rsharma
 * @created_date Dec 10, 2017
 */

package com.javabasics.akash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {

		Set s = new HashSet();

		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(123);
		hs.add(345);
		hs.add(123);
		hs.add(456);
		hs.add(3564);
		System.out.println(hs.remove(123));

		System.out.println(hs.remove(123));

		hs.size();

		System.out.println(hs);

		System.out.println(hs);

		Iterator<Integer> i = hs.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}

		for (int ir : hs) {
			System.out.println(ir);
		}

	}

}
