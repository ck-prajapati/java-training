package com.chirag.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List strList = new ArrayList<>();

		// add at last
		strList.add(0, "0");

		// add at specified index
		strList.add(1, "1");

		// replace
		strList.set(1, "2");

		// remove
		strList.remove("1");
		strList.add("1");

		strList.sort(Comparator.naturalOrder());
		System.out.println(strList);

		List<String> listStrings = new LinkedList<String>();
		listStrings.add("Five");
		listStrings.add("Six");
		listStrings.add("Seven");
		listStrings.add("Eight");
		System.out.println(listStrings);

		List<Integer> linkedList = new LinkedList<>();

		linkedList.add(2);
		linkedList.add(25);
		linkedList.add(12);
		linkedList.add(52);
		linkedList.add(2);
		linkedList.add(1);

		System.out.println(linkedList.size());

		System.out.println(linkedList);

	}

}
