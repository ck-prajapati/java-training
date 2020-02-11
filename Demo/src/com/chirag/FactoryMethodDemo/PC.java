package com.chirag.FactoryMethodDemo;

public class PC extends Computer {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	
	@Override
	public String getRam() {
		return this.ram;
	}

	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getHdd() {
		return this.hdd;
	}

	@Override
	public String getCpu() {
		return this.cpu;
	}

}
