package com.chirag.FactoryMethodDemo;

public class TestFactory {

	public static void main(String[] args) {

		Computer pc = ComputeFactory.getComputer("PC", "8GB", "500GB", "i7 2.4 GHz");
		System.out.println("PC Config = " + pc);

		Computer server = ComputeFactory.getComputer("Server", "16GB", "2TB", "i7 2.4 GHz");
		System.out.println("Server Config = " + server);
	}

}
