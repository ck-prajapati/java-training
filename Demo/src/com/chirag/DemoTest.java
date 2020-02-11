package com.chirag;

public class DemoTest {

	static final StringBuilder sb = new StringBuilder("hello");
	static final String str = new String("a");

	public static void main(String[] args) {

		final int a = 100;

		System.out.println(sb + "\t" + str);

		sb.append(" world");
		str.concat("b");

		System.out.println(sb + "\t" + str);

	}
}
