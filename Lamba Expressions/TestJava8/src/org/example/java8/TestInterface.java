package org.example.java8;


// The annotation @FunctionalInterface wont work on other versions of Java
/*
 * Here we are defining a simple interface with a simple
 * public method called test()
 * 
 */

@FunctionalInterface
public interface TestInterface {

	public void test();
	
}
