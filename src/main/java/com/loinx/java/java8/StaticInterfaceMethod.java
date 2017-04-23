/**
 * 
 */
package com.loinx.java.java8;

/**
 * The example explains about using static interface method
 * 
 * @author LoiNX
 * 
 * @since 04/23/2017
 *
 */
public class StaticInterfaceMethod {
	public static void main(String[] args) {
		System.out.println(Util.numberOfCores());
	}
}

interface Util {
	/**
	 * @return the number of the core processor
	 */
	static int numberOfCores() {
		return Runtime.getRuntime().availableProcessors();
	}
}