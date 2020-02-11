package com.chirag.FactoryMethodDemo;

public class ComputeFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		System.err.println("object created...");
		return ("PC".equalsIgnoreCase(type)) ? new PC(ram, hdd, cpu)
				: "Server".equalsIgnoreCase(type) ? new Server(ram, hdd, cpu) : null;
				
	}

}
