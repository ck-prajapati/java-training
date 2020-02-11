package com.chirag;

public class TrimAndCountString {

	public static void main(String args[]) {

		String msg = "  a";//"    He is a very very good boy, isn't he?    ?   ";

		String splited[] = msg.trim().split("[\\s@&.'?$+-]+");

		if (!msg.chars().anyMatch(Character::isLetter)) {
			System.out.println("0");
		} else {
			System.out.println(splited.length);
		}

		for (String sp : splited) {
			System.out.println(sp.trim());
		}
	}
}
