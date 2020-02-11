package com.chirag.generics;

class GenericType<T extends Number> {

	T a, b;

	public void setValue(T a) {
		this.a = a;
	}

	public T getValue() {
		return a;
	}

//	public T sum(T a, T b) {
//		return a.intValue() + b.intValue();
//	}

//	public Object sum(T a, T b) {
//		return a.intValue() + b.intValue();
//	}

//	public Number sum(T a, T b) {
//		return a.intValue() + b.intValue();
//	}

	public Integer sum(T a, T b) {
		return a.intValue() + b.intValue();
	}
}

public class GenericDemo {

	public static void main(String[] args) {

		GenericType<Integer> intType = new GenericType<Integer>();
		intType.setValue(25);
		int value = intType.getValue();

		int sum = intType.sum(10, 20);

		GenericType<Double> doubleType = new GenericType<Double>();
		doubleType.setValue(25.24);
		double doubleValue = intType.getValue();

//		Object a = 4, b = 5;
		Number a = 4, b = 5;
		int s = a.intValue() + b.intValue();

	}

}
