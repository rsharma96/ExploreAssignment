/**
 * @author gaurnitai
 * @created_date Dec 10, 2017
 */

package com.javabasics.akash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		// Hashtable<Integer, String> mp = new Hashtable<Integer, String>();
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(123, "Rama");
		mp.put(124, "Krishna");
		mp.put(124, "John");
		mp.put(125, "John");
		// mp.put(126, null);
		// mp.put(127, null);
		mp.clear();
		System.out.println(mp);

		System.out.println(mp.get(123));

		mp.remove(125);
		System.out.println(mp.size());

		mp.entrySet();

		Set<Entry<Integer, String>> s = mp.entrySet();

		Iterator<Entry<Integer, String>> i = s.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
			// System.out.println(i.next().getKey());
		}

		mp.entrySet();

	}

}
