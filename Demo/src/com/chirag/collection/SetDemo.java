package com.chirag.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		// Creating HashSet and adding elements & set contains only unique element
		// HashSet<String> set = new HashSet<String>();

		Set<String> set = new HashSet<String>();

//		LinkedHashSet<String> set = new LinkedHashSet<String>();

//		TreeSet<String> set = new TreeSet<String>();     //sorted order
		set.add("Mehul");
		set.add("Chirag");
		set.add("Vishal");
		set.add("Chirag");

		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Set<Integer> intSet = new TreeSet<>();
		intSet.add(72);
		intSet.add(65);
		intSet.add(98);
		intSet.add(98);
		intSet.add(62);
		intSet.add(35);
		intSet.add(72);

		System.out.println(intSet);
	}
}