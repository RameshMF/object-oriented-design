package com.ramesh.ood.concepts.abstraction;

/**
 * Lets first create the superclass Employee. Note the usage of abstract keyword in class definition. This marks the class to be abstract, which means it can not be instantiated directly. We define a method called calculateSalary() as an abstract method. This way you leave the implementation of this method to the inheritors of the Employee class.
 * @author RAMESH
 *
 */
public abstract class Employee {
	
	private String name;
	private int paymentPerHour;
	
	public Employee(String name, int paymentPerHour) {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}
	
	public abstract int calculateSalary();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPaymentPerHour() {
		return paymentPerHour;
	}
	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
}