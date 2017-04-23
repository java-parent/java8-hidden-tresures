/**
 * 
 */
package com.loinx.java.java8;

/**
 * <p>
 * Working with default method.
 * </p>
 * 
 * <p>
 * Four rules of default method:
 * </p>
 * <ul>
 * <li>What is in the base interface</li>
 * <li>You may override the default method</li>
 * <li>If a method is in the class hierarchy then it takes precedence</li>
 * <li>If there is no method on any of the classes in the hierarchy, but two of
 * your interfaces that you implement has the default method with the same
 * signature then you must override that method in your implementation
 * class</li>
 * </ul>
 * 
 * @author LoiNX
 *
 */
public class DefaultMethod {
	public static void main(String[] args) {
		SeaPlane seaPlane = new SeaPlane();
		seaPlane.takeOff();
		seaPlane.cruise();
		seaPlane.land();
		seaPlane.turn();
	}
}

interface Fly {
	default void takeOff() {
		System.out.println("Fly::takeOff");
	}

	default void turn() {
		System.out.println("Fly::turn");
	}

	default void cruise() {
		System.out.println("Fly::cruise");
	}

	default void land() {
		System.out.println("Fly::land");
	}
}

interface FastFly extends Fly {

}

class SeaPlane extends Vehicle implements FastFly, Sail {

	public void cruise() {
		Sail.super.cruise();
	}

}

class Vehicle {
	public void land() {
		System.out.println("Vehicle::land");
	}
}

interface Sail {
	default void cruise() {
		System.out.println("Sail::cruise");
	}
}
