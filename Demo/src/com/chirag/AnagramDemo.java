package com.chirag;

import java.util.HashMap;
import java.util.Map;

public class AnagramDemo {

	public static void main(String args[]) {
		String strA = "welcome";
		String strB = "weelcom";

		System.out.println(isAnagram(strA, strB));
	}

	private static boolean isAnagram(String strA, String strB) {

		if (strA.length() != strB.length()) {
			return Boolean.FALSE;
		} else {

			Map<Character, Integer> strAMap = new HashMap<>();
			Map<Character, Integer> strBMap = new HashMap<>();
			
			int len = strA.length();
			for (int i = 0; i < len; i++) {

				if (strAMap.containsKey(strA.charAt(i))) {
					int v = strAMap.get(strA.charAt(i)) + 1;
					strAMap.put(strA.charAt(i), v);
				} else {
					strAMap.put(strA.charAt(i), 0);
				}
				
				if (strBMap.containsKey(strB.charAt(i))) {
					int v = strBMap.get(strB.charAt(i)) + 1;
					strBMap.put(strB.charAt(i), v);
				} else {
					strBMap.put(strB.charAt(i), 0);
				}
			}
			
			if(strAMap.equals(strBMap)) {
				return true;
			}
			else {
				return false;
			}

		}

	}
}