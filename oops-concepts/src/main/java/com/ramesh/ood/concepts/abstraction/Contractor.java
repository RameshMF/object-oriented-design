package com.ramesh.ood.concepts.abstraction;

/**
 * The Contractor class inherits all properties from its parent Employee but have to provide it’s own implementation to calculateSalary() method. In this case we multiply the value of payment per hour with given working hours.
 * @author RAMESH
 *
 */
public class Contractor extends Employee {
	
	private int workingHours;
	public Contractor(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}
	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * workingHours;
	}
}