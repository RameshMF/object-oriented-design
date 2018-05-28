package com.ramesh.ood.concepts.abstraction;

/**
 * The FullTimeEmployee also has it’s own implementation ofcalculateSalary()method. In this case we just multiply by constant 8 hours.
 * @author RAMESH
 *
 */
public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}
	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * 8;
	}
}
