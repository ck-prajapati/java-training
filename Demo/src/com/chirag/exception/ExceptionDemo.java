package com.chirag.exception;

public class ExceptionDemo {

	static int divideByZero(int a, int b) {
		int i = 0;
		try {
			i = a / b;
			return i;
		} catch (ArithmeticException ex) {
			System.out.println(" Inside divideByZero");
			ex.printStackTrace();
			return 0;
		}
	}

	static int computeDivision(int a, int b) throws ArithmeticException {

		int res = 0;
		res = divideByZero(a, b);
		return res;
	}

	public static void main(String[] args) {
		int a = 5, b = 0;

//		try {
		int i = computeDivision(a, b);
		System.out.println(i);
//		} catch (ArithmeticException e) {
//			System.out.println(" Inside main");
//			e.printStackTrace();
//		}

		System.out.println("Done...!!!");
	}

}
