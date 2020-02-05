package com.chirag.collection;

public class CustomerPOJO {
	
	private String name;
	
	private Long salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public CustomerPOJO(String name, Long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public CustomerPOJO() {
		super();
	}
	
	
}
