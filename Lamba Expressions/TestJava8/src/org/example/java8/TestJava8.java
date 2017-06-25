package org.example.java8;

/*
 * This is our class with the main() method so that we could run it as a
 * console based application
 * Here, we create an instance of that functional interface that we created
 * using a lambda expression.
 * What we are doing here is create an instance of the functional interface we
 * created and calling its test() method, as defined in the interface definition.
 * 
 * 
 * A little Introduction to Lambda - ***Project Lambda**
 * It is Java's attempt to support functional programming.
 * Lambda essentially means in anonymous in programming language.
 * When we define a lambda expression, what we do is we don't give a name to that 
 * function.
 * 
 * 
 * 
 */

public class TestJava8 {

	public static void main(String[] args) {

		// An instance of a functional interface using a lambda expression
		TestInterface tester = () -> System.out.println("Hello, World!!");
		tester.test();
		TestInterface tester1 = () -> System.out.println("Hello, World!!");
		tester1.test();

	}

}
