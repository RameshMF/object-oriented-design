package com.ramesh.ood.concepts.abstraction;

//---------------------------------------
//--- STEP 00 - WHAT IS ABSTRACTION & ENCAPSULATION? 
//---------------------------------------

///** 
// * Abstraction = Looking only at the information that is relevant at the time. 
// *
// * Abstraction is the process or result of generalization by reducing the information content of a concept or an observable phenomenon, 
// * typically in order to retain only information which is relevant for a particular purpose. It is starting point of design.
// * Functional abstraction - means that a function can be used without taking into account how the function is implemented. 
// * Data Abstraction - means that data can be used without taking into account how the data are stored.
// */

///**
// * Encapsulation = Data hiding mechanism.
// *
// * The process of binding or wrapping the data and the codes that operates on the data into a single entity. This keeps the data safe from 
// * outside interface and misuse. One way to think about encapsulation is as a protective wrapper that prevents code and data from being arbitrarily 
// * accessed by other code defined outside the wrapper. 
// * For example - if a field is declared private, it cannot be accessed by anyone outside the class, thereby hiding the fields within the class. 
// */

//---------------------------------------
//--- STEP 01 - UNDERSTAND ENCAPSULATION BY EXAMPLE
//---------------------------------------

/**
 * 
 * Encapsulation goals of Person class
 * 
 * (1) The id and name parameters should not be accessible directly outside Person class - achieved by private declaration
 * 
 * (2) The id value can be assigned in Person class only and other class should not be able to change - not included setId() method
 * 
 * 
 */
class Person {

	private double id;
	private String name;

	public Person() {
		// Only Person class can access and assign
		id = Math.random();
		sayHello();
	}

	// This method is protected for giving access within Person class only
	private void sayHello() {
		System.out.println("Hello - " + getId());
	}

	public double getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

/**
 * Test class for Person
 * 
 * @author tirthalp
 * 
 */
public class Abstraction {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setName("Tirthal");
		/*
		 * Note: As id and name are encapsulated in Person class, those cannot be accessed directly here. Also there is no way to assign id in this
		 * class. Try to uncomment below code and you would find compile time error.
		 */
		// p1.id = "123";
		// p1.name = "this will give compile time error";
		// p1.sayHello(); // You can't access this method, as it is private to Person

		System.out.println("Person 1 - " + p1.getId() + " : " + p1.getName());
	}
}