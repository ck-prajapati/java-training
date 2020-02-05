package com.chirag.collection;

class GenericsArithmetic<T extends Number> {
	private T number1, number2;
	double sum, product, difference;

	public void AddNumbers(T number1, T number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public double getSum() {
		sum = number1.doubleValue() + number2.doubleValue();
		return sum;
	}

	public void MultNumbers(T number1, T number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public double getProd() {
		product = number1.doubleValue() * number2.doubleValue();
		return product;
	}

	public void subtractNumbers(T number1, T number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public double getDifference() {
		if (number2.doubleValue() > number1.doubleValue()) {
			difference = number2.doubleValue() - number1.doubleValue();
			return difference;
		} else {
			difference = number1.doubleValue() - number2.doubleValue();
			return difference;
		}
	}
}

public class CollectionClassDemo {

	public static void main(String[] args) {

		GenericsArithmetic<Integer> integerNumbers = new GenericsArithmetic<>();
		integerNumbers.AddNumbers(100, 100);
		integerNumbers.subtractNumbers(100, 200);
		integerNumbers.MultNumbers(5, 6);
		System.out.println("The addition of two numbers is: " + integerNumbers.getSum());
		System.out.println("The difference between two numbers is: " + integerNumbers.getDifference());
		System.out.println("The product of two numbers is: " + integerNumbers.getProd());
		GenericsArithmetic<Double> doubleNumber = new GenericsArithmetic<Double>();
		doubleNumber.AddNumbers(150.00, 250.00);
		doubleNumber.subtractNumbers(250.00, 150.00);
		doubleNumber.MultNumbers(10.5, 15.5);
		System.out.println("The sum of two numbers is: " + doubleNumber.getSum());
		System.out.println("The difference between two numbers is: " + doubleNumber.getDifference());
		System.out.println("The product of two numbers is: " + doubleNumber.getProd());
		GenericsArithmetic<Number> floatNumber = new GenericsArithmetic<>();
		floatNumber.AddNumbers(100.5, 150.235);
		floatNumber.subtractNumbers(99, 199.89);
		floatNumber.MultNumbers(5, 89.5);
		System.out.println("The sum of two numbers is: " + floatNumber.getSum());
		System.out.println("The difference between two numbers is: " + floatNumber.getDifference());
		System.out.println("The product of two numbers is: " + floatNumber.getProd());

	}
}
