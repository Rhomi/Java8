package com.example.javase8;

import com.example.javase8.interfaces.SimpleInterface;

public class UseSimpleInterface {
	
	public static void main(String[] args) {
		
		/* The goal is to instantiate our functional interface "SimpleInterface"
		 * And then to implement the single abstract method of the interface
		 */
		
		/* Simple Interface has a single abstract method that doesn't accept arguments
		 * To represent the signature of the method, we'll use a pair of paranthesis
		 * Now this is by definition, the first part of your Lambda expression style implementation
		*/
		
		/*
		 * Now we "implement the method" by using a single line of code
		 */
		
		SimpleInterface obj = () -> System.out.println("Yoo Hoo");
		
		/*
		 * Now we have defined an object of type SimpleInterface
		 * 
		 */
		obj.doSomething();
	}

}
