package com.ramesh.ood.concepts.polymorphism;

//---------------------------------------
//--- STEP 00 - WHAT IS POLYMORPHISM? 
//---------------------------------------

///** 
// * Polymorphism = single interface multiple implementations.
// *
// * How Polymorphism is supported in Java? - In terms of interface, inheritance, method overloading and method overriding. 
// * (Method overloading and method overriding uses concept of Polymorphism in Java where method name remains same in two classes, 
// * but actual method called by JVM depends upon object at run time and done by dynamic binding in Java. In case of overloading method 
// * signature changes while in case of overriding method signature remains same and binding and invocation of method is decided on 
// * runtime based on actual object. This facility allows Java programmer to write very flexibly and maintainable code using interfaces 
// * without worrying about concrete implementation. One disadvantage of using Polymorphism in code is that while reading code you don't 
// * know the actual type which annoys while you are looking to find bugs or trying to debug program. But if you do Java debugging in 
// * IDE you will definitely be able to see the actual object and the method call and variable associated with it.)
// *
// * Where to use Polymorphism in code? - You should use super type in method argument, variable name and return type of method.
// *
// * Parameteric Polymorphism in Java - Java started to support parametric polymorphism with introduction of Generic in JDK1.5. Collection 
// * classes in JDK 1.5 are written using Generic Type which allows Collections to hold any type of object in run time without any change 
// * in code and this has been achieved by passing actual Type as parameter. 
// */

//---------------------------------------
//--- STEP 01 - UNDERSTAND POLYMORPHISM BY SIMPLE EXAMPLE
//---------------------------------------

/**
 * Test class - If variable is initialized with super type (Payment), then it gives you flexibility to assign any new implementation of that type
 * (i.e. CashPayment, CreditPayment).
 * 
 * @author tirthalp
 * 
 */
public class Polymorphism {

	public static void main(String[] args) {
		// Here the runtime polymorphism fundamental is not applied, as it is of single CashPayment form
		CashPayment c = new CashPayment();
		c.pay();

		// Now the initialization is done using runtime polymorphism and it can have many forms at runtime
		// Single payment "p" instance can be used to pay by cash and credit card
		Payment p = new CashPayment();
		p.pay(); // Pay by cash

		p = new CreditPayment();
		p.pay(); // Pay by creditcard
	}

}

/**
 * This represents payment interface
 * 
 * @author tirthalp
 * 
 */
interface Payment {
	public void pay();
}

/**
 * Cash IS-A Payment type
 * 
 * @author tirthalp
 * 
 */
class CashPayment implements Payment {

	// method overriding
	@Override
	public void pay() {
		System.out.println("This is cash payment");
	}

}

/**
 * Creditcard IS-A Payment type
 * 
 * @author tirthalp
 * 
 */
class CreditPayment implements Payment {

	// method overriding
	@Override
	public void pay() {
		System.out.println("This is credit card payment");
	}

}