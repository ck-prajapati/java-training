package com.chirag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingStringDemo {

	public static void sortedStringChunks(String s, int k) {
		List<String> parts = new ArrayList<String>();
		int len = s.length();
		String chunks[] = new String[len - (k - 1)];

		for (int i = 0; i < len - (k - 1); i++) {
			parts.add(s.substring(i, Math.min(len, i + k)).trim());
			chunks[i] = s.substring(i, Math.min(len, i + k)).trim();
		}

		System.out.println("Unsorted Array : " + Arrays.toString(chunks));

		Arrays.sort(chunks);
		System.out.println("Sorted by Arrays : " + Arrays.toString(chunks));

		parts.sort(Comparator.naturalOrder());
		System.out.println("Sorted by Comparator : " + parts);

//		parts = parts.stream().sorted(Comparator.comparing(n -> n.toString())).collect(Collectors.toList());
		parts.sort(Comparator.comparing(c -> c));
		System.out.println(parts);

	}

	public static void main(String args[]) {

		String msg = "welcometojava";
		int ex = 3;

		sortedStringChunks(msg, 2);
	}

}
