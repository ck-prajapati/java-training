package com.chirag.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithList {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();

		intList.add(364);
		intList.add(456);
		intList.add(361);
		intList.add(872);
		intList.add(735);

		// sort based on last digit using Comparator
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 100 > o2 % 100) {
					return 1;
				}
				return -1;
			}
		};

		// sort based on last digit using Comparator using lambda
		/*
		 * Collections.sort(intList, (o1, o2) -> { return (o1 % 100 > o2 % 100) ? 1 :
		 * -1; });
		 */

		System.out.println("Before Sort : " + intList);

		Collections.sort(intList, com);

		// prtin List using for each

		for (Integer a : intList) {
			System.out.print(a + " ");
		}

	}

}
