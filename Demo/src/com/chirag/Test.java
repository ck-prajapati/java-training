package com.chirag;

/**
 * @author My Lenovo
 *
 */

class demo {

	static {
		System.out.println("Demo class loading....");
	}

	public void msg() {
		System.out.println("demo class message call...");
	}

	public demo() {
		System.out.println("demo constructor call...");
		System.out.println(this.hashCode());
	}
}

class demo1 extends demo {
	static {
		System.out.println("Demo1 class loading....");
	}

	public void msg() {
		System.out.println("demo1 class message call...");
	}

	public demo1() {
		System.out.println("demo1 constructor call...");
		System.out.println(this.hashCode());
	}
}

/**
 * @author My Lenovo
 *
 */
public class Test extends demo1 {

	static int demo = 500;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("main method running.....");

		int demo1 = Integer.MAX_VALUE; // demo of identifier
		demo1 dem = new demo1(); // demo class call, static block and java dynamic feature
		dem.msg();

		String string = "chirag";
		String String = "prajapati";

		System.out.println(string + " " + String);

		System.out.println(dem.getClass().toString());
		System.out.println(dem.hashCode()); // demo of accessibility of object class method

		System.out.println(demo1);

		byte b = 127;
		float f = 10.0f / 3;
		System.out.println("Float variable : " + f + "\n" + Float.MAX_VALUE);
		double d = 10.0 / 3;
		System.out.println("double valiable : " + d + "\n" + Double.MAX_VALUE);
		
		boolean bool = true;
		System.out.println(bool);
		
		float a = Long.MAX_VALUE;
		System.out.println(Long.MAX_VALUE + " : " + a);
	}

	public Test() {
		// System.out.println(demo1);
		System.out.println("Test Call = " + demo);
	}

	static {
		System.out.println("Main Method Loading...");
		System.out.println(demo);
	}
}
