/**
 * 
 */
package com.loinx.java.java8;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

/**
 * <p>
 * Working with String joining.
 * </p>
 * <p>
 * Print the list of the String in upper case then separating with ,.
 * </p>
 * @author LoiNX
 * @since 04/23/2017
 *
 */
public class StringJoining {
	public static void main(String[] args) {
		// we have a list
		final List<String> names = Arrays.asList("Dell", "Samsung", "Acer", "Asus");

		// Normally, you can do that
		for (String name : names) {
			System.out.print(name.toUpperCase() + ", ");
		}
		// or some things like this
		System.out.println();
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i).toUpperCase();
			System.out.print(name);
			if (i != names.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		// with the new feature in Java 8 we can do
		System.out.println(names.stream().map(String::toUpperCase).collect(joining(", ")));
	}
}
