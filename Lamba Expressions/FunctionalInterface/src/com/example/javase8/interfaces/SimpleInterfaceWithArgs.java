package com.example.javase8.interfaces;

@FunctionalInterface
public interface SimpleInterfaceWithArgs {
	 
	// Our single abstract method.. That doesn't accept any args
	
	/*
	 * Now if rename the  method here from doSomething to anything you want
	 * like "Calculate", using the refactor feature of Eclipse, the method name
	 * would change in all the classes that implement this method.
	 * Eclipse and all Java editors support this feature as this is something that's
	 * new in Java 8
	 */
	public void doSomething(int val1, int val2);
	}
