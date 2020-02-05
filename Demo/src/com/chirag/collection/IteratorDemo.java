package com.chirag.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static List<CustomerPOJO> getAllCustomer() {
		List<CustomerPOJO> custList = new ArrayList<>();

		custList.add(new CustomerPOJO("Chirag", 70969L));
		custList.add(new CustomerPOJO("Mehul", 170969L));
		custList.add(new CustomerPOJO("Vishal", 70269L));

		return custList;
	}

	public static void main(String[] args) {

		Collection col = new ArrayList();

		// col.addAll(Arrays.asList(1, 5, 8, 9, 6, 3, 1, 2.35, "chirag", true));

		col.addAll(getAllCustomer());

		Iterator li = col.iterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

		List<CustomerPOJO> lst = getAllCustomer();
		lst.stream().forEach(a -> {
			System.out.println(a.getName() + " => " + a.getSalary());
		});

	}
}
